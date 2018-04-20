	// create the module and name it app
	var app = angular.module('app', ['ngMaterial']);



	// create the controller and inject Angular's $scope
	app.controller('mainController', function($scope, $http) {
	    $scope.array = [
	        { num: 0, lock: false},
	        { num: 1, lock: false},
	        { num: 2, lock: false},
	        { num: 3, lock: false},
	        { num: 4, lock: false},
	        { num: 5, lock: false},
	        { num: 6, lock: false},
	        { num: 7, lock: false},
	        { num: 8, lock: false},
	        { num: 9, lock: false}
	    ];

        $scope.myTabIndex = 0;
        $scope.nextTab = function() {
            $scope.myTabIndex = $scope.myTabIndex + 1;
            // Needed to change result button action
            if ($scope.myTabIndex < 10) {
                $scope.getQuestion($scope.myTabIndex);
            } else {
                $scope.getScore();
            }
        };

        $scope.getQuestion = function(num){
            var body = { 'num': num };
            $http({method: 'POST', url: 'http://localhost:8080/getQuestion', params: body}).
                then(function(resp) {
                    $scope.question = resp.data;
                });
        };

        $scope.answerQuestion = function(num, ans){
            var body = { 'num': num, 'ans': ans };
            if (!$scope.array[num].lock) {
                $http({method: 'POST', url: 'http://localhost:8080/answerQuestion', params: body}).
                    then(function(resp) {
                        $scope.correct = resp.data.correct;
                        $scope.array[num].lock = true;
                    });
            }
        };

		$scope.getScore = function(){
		    $http({method: 'GET', url: 'http://localhost:8080/getScore'}).
                then(function(resp) {
                    console.log(resp.data);
                    $scope.score = resp.data.score;
                });
        };

        $scope.newGame = function(){
		    $http({method: 'GET', url: 'http://localhost:8080/newGame'}).
                then(function(resp) {
                    $scope.getQuestion(0);
                    for (var i = 0; i < $scope.array.length; i++) {
                        $scope.array[i].lock = false;
                    }
                    $scope.myTabIndex = 0;
                });
        };

         $scope.newGame();
	});
