// app.controller('customersCtrl', function ($scope, $http,$compile) {
//     $scope.test = function(){
//         alert('test');
//     }
//
// TODO 动态生成html中 ng-click无效 解决方法 $compile 是传进来的
// //下边这句话就是要写入页面中的内容，首先把你写入的内容赋值给html
//     var html = "<a href='javascript:void(0);' ng-click='test()'></a>"
//
//
// //用$compile进行编译
//
//     var $html = $compile(html)($scope);
//
//
// //添加到页面中，或者你任何想添加的位置。});
//
//     $("body").append($html);
//
//
//     这样ng-click就可以触发function了
