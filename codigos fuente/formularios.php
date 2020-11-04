<!DOCTYPE html>
<html>

<head>
    <title>registro</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, inicial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
    <div class="container">
        <div class="row">
            <div class="col-md-6">

                <h3>Registrar usuario</h3>

                <form action="guardar.php" method="POST">
                    <div class="from-group">
                        <input type="text" class="form-control" name="nombre" placeholder="nombre de usuario">
                    </div>
                    <div class="from-group">
                        <input type="text" class="form-control" name="apellido" placeholder="apellido de usuario">
                    </div>
                    <div class="from-group">
                        <input type="email" class="form-control" name="correo" placeholder="correo de usuario">
                    </div>
                    <div class="from-group">
                        <input type="password" class="form-control" name="contrasena" placeholder="contraseña de usuario">
                    </div>
                    <button type="submit" name="registrar" class="btn btn-warning">Registrar</button>
                </form>

            </div>

        </div>

    </div>
</body>

</html>