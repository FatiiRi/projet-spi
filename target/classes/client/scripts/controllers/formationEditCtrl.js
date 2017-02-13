'use strict';
angular.module('app')
  .service('formationSvc', ['$http', function ($http) {
   this.fetchPopular = function(callback) {
   		var url = "http://localhost:8090/formation/edit/:codeFormation";
   		$http.get(url).then(function(response){
   			callback(response.data);
   		});
   };

  }]);


angular.module('app')
	  	.controller('FormationEdit', ['$scope','formationSvc',function ($scope,formationSvc) {
	    
		$scope.formation = [];
    	formationSvc.fetchPopular(function(data){
    			$scope.formations=data;
                console.log(data);
    	})
 	  }]);