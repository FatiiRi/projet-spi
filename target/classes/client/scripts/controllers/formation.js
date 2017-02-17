'use strict';
angular.module('app')
  .service('FRMService', ['$http', function ($http) {
   this.fetchPopular = function(callback) {
   		var url = "http://localhost:8090/formation";
   		$http.get(url).then(function(response){
   			callback(response.data);
   		});
   };  
  }]);
angular.module('app')
	  	.controller('FormationCtrl', ['$scope','FRMService',function ($scope,FRMService) {
	    
		$scope.formations=[];
    	FRMService.fetchPopular(function(data){
    			$scope.formations=data;
                console.log(data);
    	});
    	
    	
 	  }]);