	// create the module and name it app
	var app = angular.module('app', []);



	// create the controller and inject Angular's $scope
	app.controller('mainController', function($scope, $http) {

        $scope.getQuestion = function(num){
            var body = { 'num': num };
            $http({method: 'POST', url: 'http://localhost:8080/getQuestion', params: body}).
                success(function(data, status, headers, config) {
                    $scope.question = data;
                    console.log(data);
                }).error(function(data, status, headers, config) {
                    console.log(data);
                });
        };

        $scope.answerQuestion = function(num, ans){
            var body = { 'num': num, 'ans': ans };
            $http({method: 'POST', url: 'http://localhost:8080/answerQuestion', params: body}).
                success(function(data, status, headers, config) {
                    console.log(data);
                }).error(function(data, status, headers, config) {
                    console.log(data);
                });
        };


		$scope.getScore = function(){
		    $http({method: 'GET', url: 'http://localhost:8080/getScore'}).
                success(function(data, status, headers, config) {
                    $scope.score = data.score;
                }).
                error(function(data, status, headers, config) {
                    console.log(data);
                });
        };

        $scope.getQuestion(0);
        $scope.answerQuestion(0,3);
        $scope.getScore();
	});
