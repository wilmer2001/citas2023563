<?php
require_once "conexion.php";
if (isset($_GET['id'])) {
    $id = $_GET['id'];
    $nombre = $_POST['nombre'];
    $apellido = $_POST['apellido'];
    $email = $_POST['email'];

    $query = "UPDATE empleados set nombre = '$nombre',apellido = '$apellido', email = '$email' WHERE id=$id";

    mysqli_query($conn, $query);

    header('Location: seleccionar.php');
}
