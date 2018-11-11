var app = angular.module('myApp', []);
app.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode(true);
}])
app.controller('personCtrl', function ($scope, $http, $location) {
    //客户联想控件的参数
    var data = [];
    //下拉框的dom
    var checkBox = "<label class='pos-rel'><input type='checkbox' class='ace'/> <span class='lbl'></span> </label>";
    //操作框的dom
    var toolCell = " <td><div class=\"hidden-sm hidden-xs action-buttons\"><a class=\"blue\" href=\"#\"><i class=\"ace-icon fa fa-search-plus bigger-130\"></i></a> <a class=\"green\" href=\"#\"><i class=\"ace-icon fa fa-pencil bigger-130\"></i></a> <a class=\"red\" href=\"#\"><i class=\"ace-icon fa fa-trash-o bigger-130\"></i></a></div><div class=\"hidden-md hidden-lg\"><div class=\"inline pos-rel\"><button class=\"btn btn-minier btn-yellow dropdown-toggle\"data-toggle=\"dropdown\" data-position=\"auto\"><i class=\"ace-icon fa fa-caret-down icon-only bigger-120\"></i> </button><ul class=\"dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close\"><li><a href=\"#\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\"><span class=\"blue\"><i class=\"ace-icon fa fa-search-plus bigger-120\"></i></span></a></li><li><a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\"> <span class=\"green\"><i class=\"ace-icon fa fa-pencil-square-o bigger-120\"></i></span></a></li><li><a href=\"#\" class=\"tooltip-error\" data-rel=\"tooltip\"title=\"Delete\"> <span class=\"red\"><i class=\"ace-icon fa fa-trash-o bigger-120\"></i></span></a></li></ul></div></div></td>";

    //状态框dom
    var orange = "<span class=\"label label-sm label-warning\">Expiring</span>";
    var black = "  <span class=\"label label-sm label-inverse arrowed-in\">Flagged</span>";
    var blue = " <span class=\"label label-sm label-info arrowed arrowed-righ\">Sold</span>";
    var green = " <span class=\"label label-sm label-success\">Registered</span>";

    /**
     * 界面初始化加载
     */
    window.onload = function () {
        //获得菜单
        $("#sidebar").load("/Menu");
        //实例化URL，获取订单ID
        var Request = new UrlSearch();
        $scope.orderNo = Request.orderNo != null ? Request.orderNo.split("#")[0] : "";
        //获得登陆用户
        $http({
            method: 'POST',
            url: '/getUser',
        }).then(function successCallback(rs) {
            $scope.userName = rs.data;
        });
        //初始化上方的订单数据
        $http({
            method: 'POST',
            url: '/order/getOrder',
            data: {
                "orderNo": $scope.orderNo
            },
        }).then(function successCallback(rs) {
            $scope.orderNo = rs.data.orderNo;
            $scope.orderCost = rs.data.orderCost;
            $scope.orderType = rs.data.orderType;
            $scope.orderCustomer = rs.data.orderCustomer;
        });

        // 初始化客户联想控件
        $http({
            method: 'POST',
            url: '/custom/getAllCustomer',
        }).then(function successCallback(rs) {
            // $scope.userName = rs.data;
            for (var i = 0; i < rs.data.length; i++) {
                data.push({label: rs.data[i].customerName, category: rs.data[i].customerPayType})
            }
            $("#custom").catcomplete({
                delay: 0,
                source: data
            });
        });
        //初始化新增表单
        initProductTable($http);
        //初始化界面表格
        initOrderExtendTable($http, $scope);


    };
    //展示前校验
    $('#check-apply').on('shown.bs.modal', function () {
        //初始化表格

    })

    //是否可以新增订单明细数据
    $scope.addable = function () {
        $scope.orderNo == null;
    }
    //增加新的明细产品
    $scope.addNewProduct = function () {
        addNewProduct($http);
    }
    //删除已有的产品
    $scope.deleteProduct = function () {
        var oldTable = $("#orderExtend-table").DataTable();
        var oldData = oldTable.rows(".selected").data();
        if (oldData.length < 1) {
            alert("请选择一条记录");
            return;
        }
        var ids = "";
        for (var i = 0; i < oldData.length; i++) {
            ids = addList(ids, oldData[i][1])
        }
        if (confirm("是否确认删除数据？")) {
            $http({
                method: 'POST',
                url: 'orderExtend/deleteProduct',
                params: {
                    ids: ids,
                    orderNo: $scope.orderNo
                },
            }).then(function successCallback(rs) {
                alert(rs.data);
                //初始化查询
                initOrderExtendTable($http, $scope);
            });
        }
    }

    //保存新增商品
    $scope.saveOrderExtend = function () {
        if ($scope.orderNo == null) {
            saveOrderMain($scope, $http);
        } else {
            saveOrderEx($scope, $http);

        }
    }
    //跳转到审核入库的界面
    $scope.Warehousing = function () {
        window.location.href = "Warehousing?orderNo=" + $scope.orderNo;
    }


});


function saveOrderMain($scope, $http) {
    var url = '/order/saveOrder';
    $http({
        method: 'POST',
        url: url,
        data: {
            "orderCustomer": $scope.orderCustomer,
            "orderType": "1"
        },
    }).then(function successCallback(rs) {
        if (rs.data != -1) {
            $scope.orderNo = rs.data;
            alert("保存成功");
        } else {
            alert("保存失败");
        }
    });

}

//保存数据到数据库
function saveOrderEx($scope, $http) {
    var productInfo = [];
    //获取所有输入框的数字
    var newTable = $("#orderExtend-table").DataTable();
    var newData = newTable.rows().indexes();
    var BackNum = newTable.$('input');
    //alert(BackNum[21].value);
    //封装数组发送到后台
    var newRow = newTable.rows().data();
    for (var i = 0; i < newData.length; i++) {
        productInfo.push({
            "orderNo": $scope.orderNo,
            "productNo": newRow[i][1],
            "productName": newRow[i][2],
            "productSpec": newRow[i][3],
            "productUnit": newRow[i][4],
            "productPrice": newRow[i][7],
            "productManufacturer": newRow[i][6],
            "productNum": BackNum[2 * i + 1].value != "" ? BackNum[2 * i + 1].value : newRow[i][8]
        })
    }
    //开始发送
    var userScoreRecords = angular.toJson(productInfo);
    //创建FormData，封装要传送的数据
    var fd = new FormData();
    //append方法添加键值对
    fd.append("userScoreRecords", userScoreRecords);
    fd.append("orderNo", $scope.orderNo);
    fd.append("orderCustomer", $scope.orderCustomer);

    $http.post('/orderExtend/saveOrderExtend', fd, { //使用post方法 传送formdata对象
        transformRequest: angular.identity, //使用angular传参认证
        headers: {
            'Content-Type': undefined //设置请求头
        }
    }).success(function (data) {
        alert("success");
        initOrderExtendTable($http, $scope);
    }).error(function (data) {
        alert("failed");
    });
}

//前端新增后更新表格数据
function addNewProduct($http) {
    //单选框和数量输入框
    var checkBox = "<label class='pos-rel '><input type='checkbox' class='ace center'/> <span class='lbl'></span> </label>";
    var numberBox = "<input type='text' class='ace'/>";
    //获取新增表单中的数据，
    var oldTable = $('#product-table').DataTable();
    var oldData = oldTable.rows(".selected").indexes();
    //获取主表中的数据
    var newTable = $('#orderExtend-table').DataTable();
    var newData = newTable.rows().indexes();
    // ----------------比对两表，添加新选中药品信息-------------------------
    for (i = 0; i < oldData.length; i++) {
        var oldRow = oldTable.rows(oldData[i]).data();
        var different = true;
        for (j = 0; j < newData.length; j++) {
            var newRow = newTable.rows(newData[j]).data();
            if (newRow[0][1] == oldRow[0][1]) {
                different = false;
            }
        }
        if (different) {
            var newInfo = [];
            newInfo.push(checkBox);
            //选择需要的数据
            for (k = 1; k < 8; k++) {
                newInfo.push(oldRow[0][k]);
            }
            newInfo.push(0);
            newInfo.push(numberBox);
            newTable.row.add(newInfo).draw();// 添加一行到表格中
        }
    }
}

//新增商品表的初始化
function initProductTable($http) {
    //初始化加载表格数据
    var checkBox = "<label class='pos-rel '><input type='checkbox' class='ace center'/> <span class='lbl'></span> </label>";
    $http({
        method: 'POST',
        url: 'product/getAllProducts',
    }).then(function (result) {
        var table = $("#product-table").DataTable();
        table.clear();
        for (var i = result.data.length - 1; i > 0; i--) {
            table.row.add([checkBox,
                result.data[i].productNo,//编号
                result.data[i].productName,//名称
                result.data[i].typeName,//种类
                result.data[i].productSpec,//型号
                result.data[i].productUnit,//单位
                result.data[i].productManufacturer,//厂家
                result.data[i].productPrice,//进价
                result.data[i].productSum//库存量
            ]);
        }
        table.draw();
    });
}

//订单详情表的表格初始
function initOrderExtendTable($http, $scope) {
    //单选框的dom
    var checkBox = "<label class='pos-rel '><input type='checkbox' class='ace center'/> <span class='lbl'></span> </label>";
    var numberBox = "<input type='text' class='ace'/>";
    // var numberBox = "<button class='btn btn-xs btn-info editEx'><i class='ace-icon fa fa-pencil-square-o bigger-120'></i></button>";
    //初始化全部订单详细数据
    if ($scope.orderNo != "") {
        $http({
            method: 'POST',
            url: '/orderExtend/getOrderExtends',
            data: {
                "orderNo": $scope.orderNo
            },
        }).then(function successCallback(result) {
            var table = $("#orderExtend-table").DataTable();
            table.clear();
            for (var i = 0; i < result.data.length; i++) {
                table.row.add([checkBox,
                    result.data[i].productNo,
                    result.data[i].productName,
                    result.data[i].typeName,
                    result.data[i].productSpec,
                    result.data[i].productUnit,
                    result.data[i].productManufacturer,
                    result.data[i].productPrice,
                    result.data[i].productNum,
                    numberBox
                ]);
            }
            table.draw();
        });
    }

}

