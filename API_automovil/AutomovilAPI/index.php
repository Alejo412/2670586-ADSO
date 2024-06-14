<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Una AUTOMOVIL_API, donde se pueden realizar las acciones de obtener, insertar, actualizar y eliminar.">
    <title>AUTOMOVIL_API</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="icon" type="image/x-icon" href="WEB/img/icono_api.png">
    <link rel="stylesheet" href="WEB/css/styles.css">
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col">
		<h1>AUTOMOVIL_API</h1>
		</div>
	</div>
</div>
    <div class="container">
		<div class="row">
			<div class="col-6">
				<h2 class="text-center">Marca</h2>
        		<ul id="endpoint-list">

        		<li>
        			<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ObtenerMarca.php">API/ObtenerMarca.php</a> </span></h4>
        			<h5>Metodo: GET</h5>
        			<h5>Parametros:</h5>
        			<ul class="input-list">
        				<li></li>
        			</ul>
        			<h5 style="padding-top:5px;">Salida: JSON</h5>
        			<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
						<h5 style="padding-top:5px;">Lista de marcas:</h5>
						<pre>
                        	&nbsp;&nbsp;[
                        	<br>&nbsp;&nbsp;&nbsp;&nbsp;{
                        	<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_marca": "01",
                        	<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre": "Mazda"
                        	<br>&nbsp;&nbsp;&nbsp;&nbsp;},
                        	<br>&nbsp;&nbsp;&nbsp;&nbsp;{
                        	<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_marca": "02",
                        	<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre": "Ford"
                        	<br>&nbsp;&nbsp;&nbsp;&nbsp;}
                        	<br>&nbsp;&nbsp;]
                    	</pre>
        			</div>
        		</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/InsertarMarca.php">API/InsertarMarca.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>String</b></i> id_marca</li>
					<li><i><b>String</b></i> nombre</li>
					
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Persona actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##MARCA##INSERT"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##MARCA##INSERT"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ActualizarMarca.php">API/ActualizarMarca.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
                        <li><i><b>String</b></i> id_marca</li>
                        <li><i><b>String</b></i> nombre</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Marca actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##<li><i><b>String</b></i> id_marca</li>
					<li><i><b>String</b></i> nombre</li>##UPDATE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##MARCA##UPDATE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/EliminarMarca.php">API/EliminarMarca.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
                        <li><i><b>String</b></i> id_marca</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Marca eliminada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##DELETE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en eliminacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DELETE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>
        	</ul>
			</div>
			<div class="col-6">
			<h2 class="text-center" >Automovil</h2>
        <ul id="endpoint-list">

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ObtenerAuto.php">API/ObtenerAuto.php</a> </span></h4>
        		<h5>Metodo: GET</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li></li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Lista de automoviles:</h5>
					<pre>
                        &nbsp;&nbsp;[
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;{
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"matricula": "DXZ-622",
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"marca": "01"
						<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Modelo": "2025",
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Color": "Rojo"
						<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Precio": "100000000"
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;},
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;{
							<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"matricula": "LDM-992",
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"marca": "01"
						<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Modelo": "2020",
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Color": "Gris"
						<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Precio": "89000000"
                        <br>&nbsp;&nbsp;&nbsp;&nbsp;}
                        <br>&nbsp;&nbsp;]
                    </pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/InsertarAuto.php">API/InsertarAuto.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>String</b></i> matricula</li>
					<li><i><b>String</b></i> marca</li>
					<li><i><b>String</b></i> modelo</li>
					<li><i><b>String</b></i> color</li>
					<li><i><b>String</b></i> precio</li>
					
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Persona actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##AUTOMOVIL##INSERT"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##AUTOMOVIL##INSERT"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ActualizarAuto.php">API/ActualizarAuto.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
					<li><i><b>String</b></i> matricula</li>
					<li><i><b>String</b></i> marca</li>
					<li><i><b>String</b></i> modelo</li>
					<li><i><b>String</b></i> color</li>
					<li><i><b>String</b></i> precio</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Automovil actualizado:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##<li><i><b>String</b></i> id_marca</li>
					<li><i><b>String</b></i> nombre</li>##UPDATE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##AUTOMOVIL##UPDATE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/EliminarAuto.php">API/EliminarAuto.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
                        <li><i><b>String</b></i> matricula</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Automovil eliminado:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##DELETE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en eliminacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DELETE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>
        </ul>

			</div>

			
		</div>
      
    </div>

	


    

    <script src="WEB/js/script.js"></script>
</body>
</html>

