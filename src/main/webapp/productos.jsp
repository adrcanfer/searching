<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width; initial-scale=1.0">
<link rel="shortcut icon" href="css/icono_buscador.png">

<link rel="stylesheet" type="text/css" href="css/estilo_comun.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo_prodBusc.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo_navegacion.css"/>

<title>Resultado productos</title>
</head>
<body>

	<ul>
		<li><a href="Inicio.html">Inicio</a></li>
		<li><a href="/googleDriveListing">Productos favoritos</a></li>
	</ul>
	
	<div class="enlaces">
			<a id="anterior"href="searchController?pagination=anterior">Anterior</a>
			<p>Página <c:out value="${requestScope.page}" /></p>
			<a id="siguiente" href="searchController?pagination=siguiente">Siguiente</a>
	</div>
	
	<c:forEach items="${requestScope.itemsEbay}" var="producto">
		<div class="cajaProducto">
		
			<c:forEach items="${producto.viewItemURL}" var="productoEbay">
				<a href="<c:out value= '${productoEbay}'/>" target="_blank">
					<c:forEach items="${producto.galleryURL}" var="imagenes">
						<img id="Imagen" src="<c:out value= '${imagenes}'/>" width="200" height="200"></img>
					</c:forEach>
				</a>
			</c:forEach>
			
			<div class="titulo">
				<c:forEach items="${producto.title}" var="titulo">
					<strong>Descripción:</strong><a href="<c:out value= '${productoEbay}'/>" target="_blank">
					 <c:out value="${titulo}" />
					 </a>
				</c:forEach>
			</div>
			
			<div class="precio">
				<c:forEach items="${producto.sellingStatus}" var="selling">
					<c:forEach items="${selling.currentPrice}" var="current">
						<strong>Precio de venta:</strong> <c:out value="${current.value}"/>&#8364
				</c:forEach>
					</c:forEach>
			</div>
			
			<div class="proveedor">
				<strong>Proveedor:</strong> eBay.
			</div>
			
			<div class="botonGuardar">
				<c:forEach items="${producto.title}" var="titulo">
					<c:forEach items="${producto.viewItemURL}" var="productoEbay">
						<a href="GoogleDriveFileNew?title=<c:out value= '${titulo}'/>&url=<c:out value= '${productoEbay}'/>">Guardar producto</a>
					</c:forEach>
				</c:forEach>
			</div>
			
		</div>
	</c:forEach>
	
	
	<c:forEach items="${requestScope.itemsAli}" var="producto">
	<div class="cajaProducto">
		<a href="<c:out value= '${producto.productUrl}'/>" target="_blank">
			<img id="Imagen" src="<c:out value= '${producto.imageUrl}'/>" width="200" height="200"></img>
		</a>
		<div class="titulo">
			<strong>Descripción:</strong><a href="<c:out value= '${producto.productUrl}'/>" target="_blank"> 
			<c:out value="${producto.productTitle}"/>
			</a>
		</div>
		<div class="botonGuardar">
			<a href="GoogleDriveFileNew?title=<c:out value= '${producto.productTitle}'/>&url=<c:out value= '${producto.productUrl}'/>">Guardar producto</a>
		</div>
		<div class="precio">
			<strong>Precio de venta:</strong> <c:out value="${producto.localPrice}"/>&#8364
		</div>
		
		<div class="proveedor">
			<strong>Proveedor:</strong> Aliexpress.
		</div>
	</div>
	</c:forEach>
	
	<div class="enlaces">
			<a id="anterior" href="searchController?pagination=anterior">Anterior</a>
			<p>Página <c:out value="${requestScope.page}" /></p>
			<a id="siguiente" href="searchController?pagination=siguiente">Siguiente</a>
	</div>
	
	
	
	
</body>
</html>