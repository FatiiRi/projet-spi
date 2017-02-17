'use strict';
angular.module('app')
  .service('suppService', ['$http','$location', function ($http,$location) {
   //La fonction de suppression d'une formation
   this.supprimer = function(codeFormation,callback){
	   var url = "http://localhost:8090/formation/delete/"+codeFormation;
	   $http.get(url).then(function(response){
		   callback(response.data);
	   });
   };
  }]);

angular.module('app')
	  	.controller('SupprimerFormation', ['$scope','suppService','$routeParams','$location',function ($scope,suppService,$routeParams,$location) {
		$scope.message="";
		var codeFormation = $routeParams.codeFormation;
    	//Suppression
    	suppService.supprimer(codeFormation,function(data){
    		$scope.message = "La formation était supprimer ";
    		console.log($scope.message);
    		console.log(data);
    		$location.path('/formation');
    	});
 	  }]);