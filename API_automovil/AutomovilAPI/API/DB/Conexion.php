<?php
	header("Content-Type: application/json"); //archivo json, puede enviar y recibir json
	header("Access-Control-Allow-Origin: * "); //permitir todos los orignese(IP)
    header("Access-Control-Allow-Methods: GET, POST");//los metodos de acceso. Se pueden agregar mas(delete, put...)
	header("Access-Control-Allow-Headers: Content-Type");//encapsular todo el paquete en Json

	$servidor = 'localhost';
	$usuario = 'root';
	$contrasena = '';
	$nombre_de_base = 'automovilAPI';

	/*
	$servidor = '162.241.61.249';
	$usuario = 'codetes1_adso';
	$contrasena = 'Adso2024!';
	$nombre_de_base = 'codetes1_api_personas';
	*/

	try{
	   $base_de_datos = new PDO("mysql:host=$servidor;dbname=$nombre_de_base", $usuario, $contrasena);
	}catch(Exception $e){
	   echo 'Ha surgido un error y no se puede conectar a la base de datos. Detalle: ' . $e->getMessage();
	   exit;
	}
?>