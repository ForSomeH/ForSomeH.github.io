var app = angular.module('myApp', []);
app.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode(true);
}])
app.controller('personCtrl', function ($scope, $http, $location) {

    //初始化函数
    window.onload = function () {
        //加载菜单
        $("#sidebar").load("/menu");
        //加载操作用户名
        $http({
            method: 'POST',
            url: '/getUser',
        }).then(function successCallback(rs) {
            $scope.userName = rs.data;
        });
        //初始化加载表格数据
        initTable($http);

    };
    $scope.addInit = function () {
        initForm($scope);
    }
    //新增类别函数
    $scope.addType = function () {
        if ($scope.typeCode == null) {
            $http({
                method: 'POST',
                url: 'type/addType',
                data: {
                    "typeName": $scope.typeName
                },
            }).then(function successCallback(rs) {
                initTable($http);

            });
        } else {
            $http({
                method: 'POST',
                url: 'type/updateType',
                data: {
                    "typeCode": $scope.typeCode,
                    "typeName": $scope.typeName
                },
            }).then(function successCallback(rs) {
                initTable($http);

            });
        }

    }
    //模态框自动校验函数
    $('#check-apply').on('hide.bs.modal', function ($scope) {
        initForm($scope);
    })



    //编辑前的赋值函数
    $scope.edit = function () {
        //如果没有选择行，提示选择
        var oldtable = $("#dynamic-table").DataTable();
        var olddata = oldtable.rows(".selected").indexes();
        if (olddata.length != 1) {
            alert("请选择一条订单进行编辑");
            return;
        } else {
            //取值函数，将所选行的值赋给模态框
            var oldrow = oldtable.rows(olddata[0]).data();
            $scope.typeCode = oldrow[0][1];
            $scope.typeName = oldrow[0][2];
        }
    }
    //多选模态框不弹出属性判断
    $scope.editOne = function () {
        if ($("#dynamic-table") == null) {
            return true;
        }
        var oldtable = $("#dynamic-table").DataTable();
        var olddata = oldtable.rows(".selected").indexes();
        if (olddata.length != 1) {
            return true;
        } else {
            return false;
        }
    }
    //删除函数
    $scope.deleteType = function () {
        var oldtable = $("#dynamic-table").DataTable();
        var olddata = oldtable.rows(".selected").indexes();
        if (olddata.length < 1) {
            alert("请选择一条类别进行删除");
            return;
        }
        if (confirm("是否确认删除数据？")) {
            var oldrow = oldtable.rows(olddata[0]).data();
            $scope.typeCode = oldrow[0][1];
            $http({
                method: 'POST',
                url: 'type/deleteType',
                data: {
                    "typeCode": $scope.typeCode
                },
            }).then(function successCallback(rs) {
                alert(rs.data);
                //初始化查询
                initTable($http);
            });
        }
    }


});

//表格初始化
function initTable($http) {
    var checkBox = "<label class='pos-rel'><input type='checkbox' class='ace'/> <span class='lbl'></span> </label>";

    $http({
        method: 'POST',
        url: 'type/getAllTypes',
    }).then(function (result) {
        var table = $("#dynamic-table").DataTable();
        table.clear();
        for (var i = 0; i < result.data.length; i++) {
            table.row.add([checkBox,
                result.data[i].typeCode,
                result.data[i].typeName
            ]);
        }
        table.draw();
    });
}

//清空模态框
function initForm($scope) {
    $scope.typeCode = null;
    $scope.typeName = null;
}