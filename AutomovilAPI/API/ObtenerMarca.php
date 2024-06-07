<?php 
	include 'DB/Conexion.php';

    $consulta = $base_de_datos->query("SELECT * FROM marca");
    $datos = $consulta->fetchAll(PDO::FETCH_ASSOC); 
    $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");

    echo json_encode($datos);
?>