<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['id_marca']) and !empty($_POST['nombre'])) {

        $id_marca = $_POST['id_marca'];
        $nombre = $_POST['nombre'];
        
        

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO marca (id_marca, nombre) VALUES(:idM, :nom ) ");
            $consulta->bindParam(':idM', $id_marca);
            $consulta->bindParam(':nom', $nombre);

           
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##MARCA##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##MARCA##INSERT"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
