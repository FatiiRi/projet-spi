'use strict';
angular.module('app')
  .service('ENSService', ['$http', function ($http) {
   this.fetchPopular = function(callback) {
   		var url = "http://localhost:8090/enseignants";
   		$http.get(url).then(function(response){
   			callback(response.data);
   		});
   };  
  }]);
angular.module('app')
	  	.controller('enseignantsCtrl', ['$scope','ENSService',function ($scope,ENSService) {
	    
		$scope.enseignants=[];
		ENSService.fetchPopular(function(data){
    			$scope.enseignants=data;
                console.log(data);
    	});
    	
    	
 	  }]);