



//拼接id
function addList(ids, oldDatumElement) {
    if (ids.length == 0) {
        ids += oldDatumElement;
    } else {
        ids += "," + oldDatumElement;
    }
    return ids;
}

//获取url中的参数,获取主订单数据
function UrlSearch() {
    var name, value;
    var str = location.href; //取得整个地址栏
    var num = str.indexOf("?")
    str = str.substr(num + 1); //取得所有参数   stringvar.substr(start [, length ]

    var arr = str.split("&"); //各个参数放到数组里
    for (var i = 0; i < arr.length; i++) {
        num = arr[i].indexOf("=");
        if (num > 0) {
            name = arr[i].substring(0, num);
            value = arr[i].substr(num + 1);
            this[name] = value;
        }
    }
}