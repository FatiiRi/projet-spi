'use strict';
angular.module('app')
  .service('formationSvc', ['$http', function ($http) {
   this.fetch = function(codeFormation,callback) {
   		var url = "/formation/"+codeFormation;
   		$http.get(url).then(function(response){
   			callback(response.data);
   		});
   };

  }]);


angular.module('app')
	  	.controller('formationEditCtrl', ['$scope','formationSvc','$routeParams',function ($scope,formationSvc,$routeParams) {
	    
		$scope.formation = null;
		var codeFormation = $routeParams.codeFormation;
		console.log($routeParams.codeFormation);
    	formationSvc.fetch(codeFormation,function(data){
    			$scope.formation=data;
                console.log(data);
    	})
 	  }]);