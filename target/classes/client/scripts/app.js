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
      
        .when('/dashboard',{
    	   templateUrl: 'views/dashboard.html',
           controller: 'dashboardCtrl',
           controllerAs: 'dashboard'
    	  
      })
      
        .when('/enseignants',{
    	   templateUrl: 'views/enseigants.html',
           controller: 'enseignantsCtrl',
           controllerAs: 'enseignants'
    	  
      })
      .otherwise({
        redirectTo: '/'
      });
  } ]);
  
}).call(this);