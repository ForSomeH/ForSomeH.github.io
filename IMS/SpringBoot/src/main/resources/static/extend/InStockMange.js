var app = angular.module('myApp', []);
app.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode(true);
}])


app.controller('personCtrl', function ($scope, $http, $interval, $compile) {
    //单选框的dom
    var checkBox = "<label class='pos-rel '><input type='checkbox' class='ace center'/> <span class='lbl'></span> </label>";
    //状态框dom
    var orange = "<span class='label label-sm label-warning'>Expiring</span>";
    var black = "  <span class='label label-sm label-inverse arrowed-in'>Flagged</span>";
    var blue = " <span class='label label-sm label-info arrowed arrowed-righ'>Sold</span>";
    var green = " <span class='label label-sm label-success'>Registered</span>";
    //初始化函数
    window.onload = function () {
        $("#sidebar").load("/Menu");
        //初始化用户
        $http({
            method: 'POST',
            url: '/getUser',
        }).then(function successCallback(rs) {
            $scope.userName = rs.data;
        });
        //初始化加载表格数据
        initOrderTable($http);
    };


     //删除按钮
    $scope.deleteOrders = function () {
        var orderTable = $("#InOrder-table").DataTable();
        var checkOrders = orderTable.rows(".selected").data();
        if (checkOrders.length < 1) {
            alert("至少选择一条订单进行删除！");
            return;
        }
        var ids = "";
        for (var i = 0; i < checkOrders.length; i++) {
            ids = addList(ids, checkOrders[i][2])
        }
        if (confirm("是否确认删除订单？")) {
            $http({
                method: 'POST',
                url: 'order/deleteOrders',
                params: {
                    ids: ids
                },
            }).then(function successCallback(rs) {
                alert(rs.data);
                //初始化查询,刷新界面
                initOrderTable($http);
            });
        }
    }
    //编辑点击事件
    $('#InOrder-table tbody').on('click', '.editEx', function () {
        var table = $('#InOrder-table').DataTable();
        var nowRow = table.row($(this).parents('tr')).data();
        window.location.href = "InStock?operationNo=" + nowRow[2];
    });
    //查看点击事件
    $('#InOrder-table tbody').on('click', '.viewEx', function () {
        var table = $('#InOrder-table').DataTable();
        var nowRow = table.row($(this).parents('tr')).data();
        window.location.href = "orderExtendView?operationNo=" + nowRow[2];
    });


});

//转化时间的函数
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

//初始化加载表格数据
function initOrderTable($http) {
    //单选框的dom
    var checkBox = "<label class='pos-rel '><input type='checkbox' class='ace center'/> <span class='lbl'></span> </label>";
    var toolIcon = "<div class='hidden-sm hidden-xs action-buttons'>" +
        "<a class='blue viewEx' ><i class='ace-icon fa fa-search-plus bigger-130'></i></a>" +
        "<a class='green editEx'><i class='ace-icon fa fa-pencil bigger-130 '></i></a>" +
        "<a class='red' href='#'><i class='ace-icon fa fa-trash-o bigger-130'></i></a></div>";
    $http({
        method: 'POST',
        url: 'Operation/getAllOperation',
        params: {
            type: "1"
        },
    }).then(function (result) {
        var table = $("#InOrder-table").DataTable();
        table.clear();
        for (var i = 0; i < result.data.length; i++) {
            table.row.add([checkBox,
                toolIcon,
                result.data[i].operationNo,
                result.data[i].codeDisplay,
                result.data[i].orderNo,
                result.data[i].orderCustomer,
                result.data[i].stockName,
                result.data[i].creater,
                formatDate(result.data[i].crateTime),
                result.data[i].lastModifier,
                formatDate(result.data[i].lastModifyerTime)
            ]);
        }
        table.draw();
    });
}

//拼接id
function addList(ids, oldDatumElement) {
    if (ids.length == 0) {
        ids += oldDatumElement;
    } else {
        ids += "," + oldDatumElement;
    }
    return ids;
}