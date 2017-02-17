'use strict';
angular.module('app')
  .service('formationSvc', ['$http','$location', function ($http,$location) {
   this.fetch = function(codeFormation,callback) {
   		var url = "/formation/"+codeFormation;
   		$http.get(url).then(function(response){
   			callback(response.data);
   		});
   };
   
   this.modifierFormation = function(formation){
		console.log("je suis dans la modification");
		console.log(formation);
		//il arrive ici
		var request = $http({
			method: "PUT",
			url: 'http://localhost:8090/formation/update',
			data: formation,
			dataType: "application/json;charset=utf-8"
		});
		request.then(	
			function(response) {
				console.log("sucess");
				console.log(+response.data);
				$location.path('/formation');
			}
		)
	};

  }]);


angular.module('app')
	  	.controller('formationEditCtrl', ['$scope','formationSvc','$routeParams',function ($scope,formationSvc,$routeParams) {
	    	
		$scope.formation = null;
		$scope.message = "";
		$scope.formation2 = {
				codeFormation : "",
				nomFormation : "",
				diplome : "",
				doubleDiplome : "",
				n0Annee : "",
				debutAccreditation : "" ,
				finAccreditation : ""
			}
		
		
		var codeFormation = $routeParams.codeFormation;
		console.log($routeParams.codeFormation);
    	formationSvc.fetch(codeFormation,function(data){
    			$scope.formation=data;
                console.log(data);
                
                
              	$scope.formation2["codeFormation"]=$scope.formation["codeFormation"];
            	$scope.formation2["nomFormation"]=$scope.formation["nomFormation"];
            	$scope.formation2["diplome"]=$scope.formation["diplome"];
            	$scope.formation2["doubleDiplome"]=$scope.formation["doubleDiplome"];
            	$scope.formation2["n0Annee"]=$scope.formation["n0Annee"];
            	$scope.formation2["debutAccreditation"]=$scope.formation["debutAccreditation"];
            	$scope.formation2["finAccreditation"]=$scope.formation["finAccreditation"];
            	
            	
            	
    	});
    	
    	
    	
  
    	
    	
    	    	
    	
    	
    	$scope.updateFormation = function(){
    		console.log("je suis dans submit");
    		$scope.formation2["Content-Type"] = "application/json";
    		formationSvc.modifierFormation($scope.formation2);
    	};
    	
    	
    	
    	
    
    	
 	  }]);
