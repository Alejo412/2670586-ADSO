<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['matricula']) and !empty($_POST['marca']) and !empty($_POST['modelo']) ) {

        $matriula = $_POST['matricula'];
        $marca = $_POST['marca'];
        $modelo = $_POST['modelo'];
        $color = $_POST['color'];
        $precio = $_POST['precio'];
        

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO automovil (matricula, marca, modelo, color, precio) VALUES(:mat, :mar, :mod, :col, :pre) ");
            $consulta->bindParam(':mat', $matriula);
            $consulta->bindParam(':mar', $marca);
            $consulta->bindParam(':mod', $modelo);
            $consulta->bindParam(':col', $color);
            $consulta->bindParam(':pre', $precio);
           
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##AUTOMOVIL##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##AUTOMOVIL##INSERT"
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
