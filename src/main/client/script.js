	// create the module and name it app
	var app = angular.module('app', []);



	// create the controller and inject Angular's $scope
	app.controller('mainController', function($scope, $http) {


		// create a message to display in our view
		$scope.message = 'Everyone come and see how good I look!';
		$http({method: 'GET', url: 'http://localhost:8080/getScore'}).
            success(function(data, status, headers, config) {
              // this callback will be called asynchronously
              // when the response is available
              console.log(data);
            }).
            error(function(data, status, headers, config) {
              // called asynchronously if an error occurs
              // or server returns response with an error status.
            });
	});
