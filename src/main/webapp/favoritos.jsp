
<%@page import="aiss.model.google.drive.FileItem"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/estilo_comun.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo_fav.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo_navegacion.css"/>

<meta name="viewport" content="width=device-width; initial-scale=1.0">
<link rel="shortcut icon" href="css/icono_buscador.png">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Productos favoritos</title>
</head>
<body>


	<ul>
		<li><a href="Inicio.html">Inicio</a></li>
		<li><a href="/searchController">Productos</a></li>
	</ul>

	 
	 	<c:forEach items="${requestScope.files}" var="ficheros">	
	 		<div class="productoGuardado"> 	
	 			<p> <a href="<c:out value= '${ficheros.url}'/>" target="_blank"> <c:out value="${ficheros.titulo}" /> </a></p>
	 			<a class="borrar" href="GoogleDriveFileDelete?id=<c:out value= '${ficheros.id}'/>">Borrar producto</a>
	 		</div>
	 	</c:forEach>
	
	 
	

</body>
</html>