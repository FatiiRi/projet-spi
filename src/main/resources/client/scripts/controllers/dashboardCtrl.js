'use strict';
angular.module('app')
  .service('dashboardService', ['$http', function ($http) {
   this.countFormations = function(callback) {
   		var url = "http://localhost:8090/formation/nbformations";
   		$http.get(url).then(function(response){
   			callback(response.data);
   		});
   };
   
   this.countEnseignants = function(callback){
	   var url = "http://localhost:8090/enseignants/nbEnseignats";
	   $http.get(url).then(function(response){
  			callback(response.data);
  		});
   }
  }]);
angular.module('app')
	  	.controller('dashboardCtrl', ['$scope','dashboardService',function ($scope,dashboardService) {
		$scope.nombreFormations=0;
		$scope.nombreEnseignats=0;
		$scope.nombrePromotions=0;
		$scope.nombreEtudiants=0;
		dashboardService.countFormations(function(data){
    			$scope.nombreFormations=data;
                console.log(data);
    	});
		
		dashboardService.countEnseignants(function(data){
			$scope.nombreEnseignats=data;
            console.log(data);
	});
		
 	  }]);