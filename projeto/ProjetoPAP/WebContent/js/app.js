angular.module("app", [ "ngRoute" ]);

angular.module("app").config(function($routeProvider) {	
	
	$routeProvider
    .when("/cadEstado", {
        templateUrl : "views/cadEstado.html"
    })
	
    .when("/cadCidade", {
        templateUrl : "views/cadCidade.html"
    })
	
    .when("/cadInstituicao", {
        templateUrl : "views/cadInstituicao.html"
    })
	
    .when("/cadProjeto", {
        templateUrl : "views/cadProjeto.html"
    })
	
    .when("/cadCurso", {
        templateUrl : "views/cadCurso.html"
    });
});	
