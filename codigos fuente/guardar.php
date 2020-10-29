<?php
require_once "conexion.php";
$nombre = $_POST["nombre"];
$apellido = $_POST["apellido"];
$correo = $_POST["correo"];
$contrase = md5($_POST["contrasena"]);


$sql1 = "SELECT * FROM empleados WHERE email=\"$_POST[correo]\"";
$query = $conn->query($sql1);
while ($r = $query->fetch_array()) {
    $r = true;
    if ($r) {
        print "<script>alert(\"nombre del usuario o email ya registrado.\"); window.location='../guardar.php';</script>";
    }
}

$querys = "insert into empleados(nombre, apellido, email, contrasena) values('$nombre','$apellido','$correo','$contrase')";

if ($conn->query($querys) === true) {
    print " usuario registrado";
    print "<script>alert(\"registro exitoso.\");window.location='seleccionar.php';</script>";
} else {
    echo " error al registrar datos:" . $conn->error;
}

    

