var app = angular.module('myApp', []);
//表格数据更新后的重新渲染
app.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode(true);
}])
app.controller('personCtrl', function ($scope, $http, $location) {
    var TypeDict = new Map();
    window.onload = function () {
        //初始化菜单
        $("#sidebar").load("/menu");
        //初始化用户
        $http({
            method: 'POST',
            url: '/getUser',
        }).then(function successCallback(rs) {
            $scope.userName = rs.data;
        });
        //初始化表格
        initTable($http);
        //初始化商品类型下拉框
        $http({
            method: 'POST',
            url: 'type/getAllTypes',
        }).then(function (result) {
            $scope.names = result.data;
            //初始化数据字典
            for (var i = 0; i < $scope.names.length; i++) {
                TypeDict.set($scope.names[i].typeName, $scope.names[i].typeCode)
            }
        });

    };

    $scope.newProduct = function () {
        initForm($scope);
    }
    //新增产品函数
    $scope.addProduct = function () {
        //进行判断校验是否通过
        if ($('#validation-form').valid()) {
            //通过productNo是否为空判断是新增还是编辑
            if ($scope.productNo == null) {
                $http({
                    method: 'POST',
                    url: 'product/addProduct',
                    data: {
                        "productName": $scope.productName,
                        "productType": $scope.productType,
                        "productSpec": $scope.productSpec,
                        "productManufacturer": $scope.productManufacturer,
                        "productPurcprice": $scope.productPurcprice,
                        "productPrice": $scope.productPrice,
                        "remarks": $scope.remarks
                    },
                }).then(function successCallback(rs) {
                    //展示结果
                    alert(rs.data);
                    //隐藏表单
                    $("#check-apply").modal('hide');
                    //初始化查询
                    initTable($http);
                });
            } else {
                $http({
                    method: 'POST',
                    url: 'product/updateProduct',
                    data: {
                        "productNo": $scope.productNo,
                        "productName": $scope.productName,
                        "productType": $scope.productType,
                        "productSpec": $scope.productSpec,
                        "productManufacturer": $scope.productManufacturer,
                        "productPurcprice": $scope.productPurcprice,
                        "productPrice": $scope.productPrice,
                        "remarks": $scope.remarks
                    },
                }).then(function successCallback(rs) {
                    //展示结果
                    alert(rs.data);
                    //隐藏表单
                    $("#check-apply").modal('hide');
                    //初始化查询
                    initTable($http);
                });
            }

        }


    }
    //删除产品的函数
    $scope.deleteProduct = function () {
        var oldtable = $("#product-table").DataTable();
        var olddata = oldtable.rows(".selected").indexes();
        if (olddata.length < 1) {
            alert("请选择一条订单进行编辑");
            return;
        }
        if (confirm("是否确认删除数据？")) {
            var oldrow = oldtable.rows(olddata[0]).data();
            $scope.productNo = oldrow[0][1];
            $http({
                method: 'POST',
                url: 'product/deleteProduct',
                data: {
                    "productNo": $scope.productNo
                },
            }).then(function successCallback(rs) {
                alert(rs.data);
                //初始化查询
                initTable($http);
            });
        }
    }
    //新增展示前重置表格
    $('#check-apply').on('hide.bs.modal', function ($scope) {
        initForm($scope);
    })
    //展示前校验
    $('#check-apply').on('shown.bs.modal', function () {
        $('#validation-form').valid();
    })
//关闭后刷新
    $('#check-apply').on('hidden.bs.modal', function () {
        window.location.href = "productMange" ;
    })

    //编辑商品前的判断和赋值
    $scope.edit = function (oldrow, $scope) {
        $scope.productNo = oldrow[2];
        $scope.productName = oldrow [3];
        $scope.productType = TypeDict.getValue(oldrow [4]);
        $scope.productSpec = oldrow [5];
        $scope.productManufacturer = oldrow [6];
        $scope.productPurcprice = oldrow [7];
        $scope.productPrice = oldrow [8];
        $scope.remarks = oldrow [9];

    }
    //编辑点击事件
    $('#product-table tbody').on('click', '.editEx', function () {
        var table = $('#product-table').DataTable();
        var oldrow = table.row($(this).parents('tr')).data();
        $scope.edit(oldrow, $scope);
    });
    //是否可以编辑查看商品
    $scope.editOne = function () {
        if ($("#product-table") == null) {
            return true;
        }
        var oldtable = $("#product-table").DataTable();
        var olddata = oldtable.rows(".selected").indexes();
        if (olddata.length != 1) {
            return true;
        } else {
            return false;
        }
    }


});

//时间转换
function formatDate(time) {

    if (time == null) {
        return time;
    }
    var year = time.substring(0, 4),
        month = time.substring(4, 6),
        day = time.substring(6, 8),
        hour = time.substring(8, 10),
        min = time.substring(10, 12),
        sec = time.substring(12, 14)
    var newTime = year + '-' +
        month + '-' +
        day + ' ' +
        hour + ':' +
        min + ':' +
        sec;
    return newTime;
}

//表格初始化
function initTable($http) {
    //初始化加载表格数据
    var checkBox = "<label class='pos-rel '><input type='checkbox' class='ace center'/> <span class='lbl'></span> </label>";
    var toolIcon = "<div class='hidden-sm hidden-xs action-buttons'>" +
        "<a class='blue viewEx' ><i class='ace-icon fa fa-search-plus bigger-130'></i></a>" +
        "<a class='green editEx' href='#check-apply' data-toggle='modal'><i class='ace-icon fa fa-pencil bigger-130 '></i></a>" +
        "<a class='red' href='#'><i class='ace-icon fa fa-trash-o bigger-130'></i></a></div>";
    $http({
        method: 'POST',
        url: 'product/getAllProducts',
    }).then(function (result) {
        var table = $("#product-table").DataTable();
        table.clear();
        for (var i = result.data.length - 1; i > 0; i--) {
            table.row.add([checkBox, toolIcon,
                result.data[i].productNo,
                result.data[i].productName,
                result.data[i].typeName,
                result.data[i].productSpec,
                result.data[i].productManufacturer,
                result.data[i].productPrice,
                result.data[i].productPurcprice,
                result.data[i].remarks]);
        }
        table.draw();
    });
}

//新增前初始化表格
function initForm($scope) {
    $scope.productNo = null;
    $scope.productName = null;
    $scope.productType = "";
    $scope.productSpec = null;
    $scope.productManufacturer = null;
    $scope.productPurcprice = null;
    $scope.productPrice = null;
    $scope.remarks = null;
}

//数据字典的转换
function Map() {
    this.keys = new Array();
    this.values = new Array();//添加键值对
    this.set = function (key, value) {
        if (this.values[key] == null) {
            //如键不存在则身【键】数组添加键名
            this.keys.push(value);
        }
        this.values[key] = value;
        //给键赋值};
        // 获取键对应的值
        this.getValue = function (key) {
            return this.values[key];
        };
        //获取值对应的键
        this.getKey = function (value) {
            return this.keys[value];
        };
        //去除键值，(去除键数据中的键名及对应的值)
        this.remove = function (key) {
            this.keys.remove(key);
            this.values[key] = null;
        };
        //判断键值元素是否为空
        this.isEmpty = function () {
            return this.keys.length == 0;
        };
        //获取键值元素大小
        this.size = function () {
            return this.keys.length;
        };
    }
}

