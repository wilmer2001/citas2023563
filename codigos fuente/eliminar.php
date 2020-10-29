<?php
require_once "conexion.php";
if(isset($_GET['id'])){
    $id=$_GET['id'];
    $query="DELETE FROM empleados WHERE id='$id'";
    if($conn->query($query)){
        print "usuario se elimino";
    }else{
        echo "error no se pudo eliminar el registro";
    }
}else{
    echo "error no se pudo procesar la peticion";
}
?>