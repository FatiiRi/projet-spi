'use strict'
angular.module('app')
.service('ServiceAjout',['$http','$location',function($http,$location){
	this.ajouterFormation = function(formation){
		console.log("je suis dans le service");
		console.log(formation);
		var request = $http({
			method: "POST",
			url: 'http://localhost:8090/formation/ajouter',
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
.controller('formationNewCtrl', ['$scope','$http','ServiceAjout',function ($scope,$http,ServiceAjout) {
	$scope.formation = {
		codeFormation : "",
		nomFormation : "",
		diplome : "",
		doubleDiplome : "",
		n0Annee : "",
		debutAccreditation : "" ,
		finAccreditation : ""
	}
	console.log("je suis dans le controller");

	$scope.ajouterNouvelleFormation = function(){
		console.log("je suis dans submit");
		$scope.formation["Content-Type"] = "application/json";
		ServiceAjout.ajouterFormation($scope.formation);
	};
}]);