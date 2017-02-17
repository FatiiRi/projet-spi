(function() {
	'use strict';
	var app = angular.module(
			'app',
			[ 'ngRoute', 'ngAnimate', 'ui.bootstrap', 'easypiechart',
					'mgo-angular-wizard', 'textAngular', 'ui.tree',
					'ngTagsInput']).config(
			[ '$routeProvider', function($routeProvider, $urlRouterProvider) {
    $routeProvider
      .when('/formation', {
        templateUrl: 'views/formation.html',
        controller: 'FormationCtrl',
        controllerAs: 'formation'
      })
      .when('/edit/:codeFormation',{
    	  templateUrl: 'views/formationDetail.html',
    	  controller: 'formationEditCtrl',
    	  controllerAs: 'FormationEdit'
    	  
      })
       .when('/delete/:codeFormation',{
    	   templateUrl: 'views/deleteFormation.html',
           controller: 'SupprimerFormation',
           controllerAs: 'SupprimerFormation'
    	  
      })
      
      .when('/newFormation',{
    	  templateUrl:'views/NewFormation.html',
    	  controller: 'formationNewCtrl',
    	  controllerAs: 'NewFormation'
      })
      .otherwise({
        redirectTo: '/'
      });
  } ]);
  
}).call(this);