<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, inicial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
    <?php require_once "conexion.php";
    if (isset($_GET['id'])) {
        $id = $_GET['id'];
        $query = "SELECT * FROM empleados WHERE id=$id";
        $result = mysqli_query($conn, $query);
        if (mysqli_num_rows($result) == 1) {
            $row = mysqli_fetch_array($result);
            $nombre = $row['nombre'];
            $apellido = $row['apellido'];
            $email = $row['email'];
            $clave = $row['contrasena'];
        }
    }
    ?>
    <div class="container p-4">
        <div class="row">
            <div class="col-md-4 mx-auto">
                <div class="card crad body">
                    <p>actualizar los datos usuarios</p>
                    <form action="editarcampos.php?id=<?php echo $_GET['id']; ?>" method="post">
                    
                        <div class="form-group">
                            <div class="form-group">
                                <input name="nombre" type="text" class="form-control" value="<?php echo $nombre; ?>">
                            </div>
                            <div class="form-group">
                                <div class="form-group">
                                    <div class="form-group">
                                        <input name="apellido" type="text" class="form-control" value="<?php echo $apellido; ?>">
                                    </div>

                                        <div class="form-group">
                                            <input name="email" type="text" class="form-control" value="<?php echo $email; ?>">
                                        </div>

                                        
                                            <div class="form-group">
                                                <input name="clave" type="text" class="form-control" value="<?php echo $clave; ?>">
                                            </div>
                                            <button class=" btn btn-danger" name="update">actualizar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>

</html>