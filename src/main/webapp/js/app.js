var formApp = angular.module('formApp', []);
function formController($scope, $http, $window) {
    $scope.formData = {};
    $scope.processForm = function() {
        $http({
            method : 'POST',
            url : 'users',
            data : {'name' : $scope.formData.name, 'password' : $scope.formData.password},
            headers : {'Content-Type' : 'application/json'}
        }).success(function(){
            $window.location.href = 'success.html';
        }).error(function(){
            $scope.duplicateUserException = true;
        });

    };
}