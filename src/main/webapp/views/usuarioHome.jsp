﻿﻿﻿﻿﻿<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>Grupo | T&iacute;tulo</title> 
		<!-- FAVICON -->
		<link rel="shortcut icon" type="image/png" href="resources/img/favicon.png"/>
		<link rel="stylesheet" type="text/css" href="css/fonts.css">
		<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="css/iconos.css">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/morris.css">
		<link rel="stylesheet" type="text/css" href="css/dataTables.bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/jquery.steps.css">
		<link rel="stylesheet" type="text/css" href="css/resets.css">
		<link rel="stylesheet" type="text/css" href="css/colores_generales.css">
		<link rel="stylesheet" type="text/css" href="css/footer.css">
		<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/ng-table/1.0.0-beta.9/ng-table.min.css">
		<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-select/0.16.1/select.min.css">
		<link rel="stylesheet" type="text/css" href="css/general_styles.css">
		<link rel="stylesheet" type="text/css" href="css/gifAnimation.css">
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular.min.js"></script>
    	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-animate.min.js"></script>    	  	
		<script src="https://cdnjs.cloudflare.com/ajax/libs/ng-table/1.0.0-beta.9/ng-table.min.js"></script>
    	<script src="//angular-ui.github.io/bootstrap/ui-bootstrap-tpls-1.2.4.js"></script>
    	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-select/0.16.1/select.min.js"></script>    
    	<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
		<script type="text/javascript" src="js/jquery.steps.min.js"></script>
		<script type="text/javascript" src="js/highstock.js"></script>
		<script type="text/javascript" src="js/jquery.flexslider-min.js"></script>
		<script type="text/javascript" src="js/jquery.totemticker.min.js"></script>
    	<script type="text/javascript" src="js/usuarioHome.js"></script>   
    	<script type="text/javascript" src="js/indicadores.js"></script>  
    	<script type="text/javascript" src="js/cuentas.js"></script>    	     	  	 
    		    	
	</head>
	<body ng-app="usuarioHome" ng-cloak>
		<!-- HEADER -->
		<header class="fondo_celeste" ng-include="'views/headerLogOut.jsp'">                    
		</header>	
		<!-- FIN HEADER -->
		<!-- ASIDE (SIDEBAR) -->
		<aside class="fondo_gris" ng-controller="usuarioHomeController" ng-init="init()">
			<div class="aside_usuario" ng-click="cargarDetalleUsuario()">
				<div class="aside_usuario_icono text-center fondo_celeste">
					<i class="icon_ba icon_ba_usuario"></i>
				</div>
				<div class="aside_usuario_datos">
<!-- 				Poner nombre de la persona MGM -->
<!-- 					<span class="aside_usuario_nombre">{{nombre}}</span> -->
				</div>
			</div>
			<div>
				<ul class="aside_opciones">
					<li class="active" id="opcion_cuentas" ng-click="cargarCuentas()"><a href="#cuentas" id="cuentaHref"><div><i class="icon_ba icon_ba_peso"></i></div><span>Cuentas</span></a></li>
					
					<li id="opcion_indicador" ng-click="cargarIndicador()"><a href="#indicador"><div><i class="icon_ba icon_ba_cotizacion"></i></div><span>Indicadores</span></a></li>
					
					<li id="opcion_metodologia" ng-click="cargarMetodologia()"><a href="#metodologia"><div><i class="icon_ba icon_ba_home"></i></div><span>Metodologias</span></a></li>
					
					<li id="opcion_comparar" ng-click="cargarComparar()"><a href="#comparar"><div><i class="icon_ba icon_ba_home"></i></div><span>Comparar</span></a></li>
				</ul>
			</div>
		</aside>
		<!-- FIN ASIDE (SIDEBAR) -->

		<!-- WRAPPER -->
		<div class="container wrapper">
			<div class="" ng-include="'views/cuentas.jsp'" id=cuentas></div>
		</div>
		<div class="container wrapper">
			<div class="" ng-include="'views/indicadores.jsp'" id="indicadores"></div>
		</div>
		<!-- FIN WRAPPER -->

		<!-- FOOTER -->
<!-- 		<footer ng-include="'resources/views/includes/footer.html'"></footer>		 -->
		<!-- FIN FOOTER -->

		
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
		<!-- LODASH JS -->
		<script type="text/javascript" src="js/ajaxResponse.js"></script>	
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.isotope/2.2.2/isotope.pkgd.min.js"></script>			
		
	</body>
</html>