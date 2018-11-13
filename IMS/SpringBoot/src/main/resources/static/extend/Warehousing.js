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
        initOrderInfo($http, $scope);
        //初始化界面表格
        initOrderExtendTable($http, $scope);
        //初始化仓库列表
        initStocks($http, $scope);
        $scope.orderNo = Request.orderNo != null ? Request.orderNo.split("#")[0] : "";

    };
    //存储数据到后台，生成入库单
    $scope.DoWarehousing = function () {
        DoWarehousingCheck($scope, $http);
    }


});


//入库审核提交
function DoWarehousingCheck($scope, $http) {
    if ($scope.orderStock == null) {
        alert("请选择仓库！")
        return;
    }

    var productInfo = [];
    //获取所有输入框的数字
    var newTable = $("#Warehousing-table").DataTable();
    var newData = newTable.rows().indexes();
    var BackNum = newTable.$('input');
    //判断是否超值

    //封装数组发送到后台
    var newRow = newTable.rows().data();
    var enough = false;
    var info = "";
    for (var i = 0; i < newData.length; i++) {
        if (BackNum[2 * i + 1].value > newRow[i][10]) {
            info += newRow[i][2] + "、";
            enough = true;
        }
        productInfo.push({
            "productNo": newRow[i][1],
            "operationNum": BackNum[2 * i + 1].value != "" ? BackNum[2 * i + 1].value : 0
        })
    }
    if (enough) {
        alert(info + "超过订单数量最大值");
        return;
    }
    //开始发送
    var goodsRecords = angular.toJson(productInfo);
    //创建FormData，封装要传送的数据
    var fd = new FormData();
    //append方法添加键值对
    fd.append("goodsRecords", goodsRecords);
    fd.append("orderNo", $scope.orderNo);
    fd.append("orderStock", $scope.orderStock);
    fd.append("type", "1");
    $http.post('/Operation/addNewOperation', fd, { //使用post方法 传送formdata对象
        transformRequest: angular.identity, //使用angular传参认证
        headers: {
            'Content-Type': undefined //设置请求头
        }
    }).success(function (data) {
        alert(data);
        initOrderExtendTable($http, $scope);
    }).error(function (data) {
        alert("操作失败");
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
            var table = $("#Warehousing-table").DataTable();
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
                    result.data[i].productDoneNum==null?0:result.data[i].productDoneNum,
                    result.data[i].productNum - result.data[i].productDoneNum,
                    numberBox
                ]);
            }
            table.draw();
        });
    }

}

//初始化上方的订单数据
function initOrderInfo($http, $scope) {
    $http({
        method: 'POST',
        url: '/order/getOrder',
        data: {
            "orderNo": $scope.orderNo
        },
    }).then(function successCallback(rs) {
        //$scope.orderNo = rs.data.orderNo;
        $scope.orderCost = rs.data.orderCost;
        $scope.orderType = rs.data.orderType;
        $scope.orderCustomer = rs.data.orderCustomer;
    });
}

//初始化仓库
function initStocks($http, $scope) {
    $http({
        method: 'POST',
        url: '/stock/getAllStock',
    }).then(function successCallback(rs) {
       // $scope.orderNo = rs.data.orderNo;
        var option = "";
        for (var i = 0; i < rs.data.length; i++) {
            option += "<option value='" + rs.data[i].stockCode + "'>" + rs.data[i].stockName + "</option>";
        }
        $("#stocks").append(option);
    });
}