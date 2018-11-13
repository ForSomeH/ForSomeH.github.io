var app = angular.module('myApp', []);
app.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode(true);
}])
app.controller('personCtrl', function ($scope, $http, $location) {
    window.onload = function () {
        $("#sidebar").load("/menu");
        //初始化用户
        $http({
            method: 'POST',
            url: '/getUser',
        }).then(function successCallback(rs) {
            $scope.userName = rs.data;
        });
        //初始化加载表格数据
        initStockTable($http);
    };
    //新增仓库函数
    $scope.addStock = function () {
        $http({
            method: 'POST',
            url: 'type/addStock',
            data: {
                "stockName": $scope.stockName,
                "stockAddr": $scope.stockAddr
            },
        }).then(function successCallback(rs) {
            alert(rs.data);
        });
    }

});

//初始化加载表格数据
function initStockTable($http) {
    //单选框的dom
    var checkBox = "<label class='pos-rel '><input type='checkbox' class='ace center'/> <span class='lbl'></span> </label>";
    var toolIcon = "<div class='hidden-sm hidden-xs action-buttons'>" +
        "<a class='blue viewEx' ><i class='ace-icon fa fa-search-plus bigger-130'></i></a>" +
        "<a class='green editEx'><i class='ace-icon fa fa-pencil bigger-130 '></i></a>" +
        "<a class='red' href='#'><i class='ace-icon fa fa-trash-o bigger-130'></i></a></div>"
    $http({
        method: 'POST',
        url: 'stockProduct/queryStockProoducts',
    }).then(function (result) {
        var table = $("#stock-table").DataTable();
        table.clear();
        for (var i = 0; i < result.data.length; i++) {
            table.row.add([checkBox,
                result.data[i].stockName,
                result.data[i].productNo,
                result.data[i].productName,
                result.data[i].productSpec,
                result.data[i].productUnit,
                //厂家
                //价格
                result.data[i].stockProductNum,
                result.data[i].lastModifier,
                formatDate(result.data[i].lastModifyerTime)
            ]);
        }
        table.draw();
    });
}

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