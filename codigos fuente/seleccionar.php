<!DOCTYPE html>
<html>

<head>
    <title>consultar</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, inicial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
    <h3>datos empleados</h3>
    <div class="col-md-8">
        <table class="table table-hover">
            <thead class="thead-info">
                <tr>
                    <th>id</th>
                    <th>nombre</th>
                    <th>apellido</th>
                    <th>email</th>
                    <th>acciones</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <?php
            require_once "conexion.php";
            $query = "SELECT * from empleados";
            $resul_tasks = mysqli_query($conn,$query);
            while($row = mysqli_fetch_assoc($resul_tasks)){?>
                <tr>
                <td><?php echo $row['id'];?></td>
                <td><?php echo $row['nombre'];?></td>
                <td><?php echo $row['apellido'];?></td>
                <td><?php echo $row['email'];?></td>
                <td>

                <a href="eliminar.php?id=<?php echo $row['id']?>" class="btn btn-danger">eliminar</a>
                <a href="editar.php?id=<?php echo $row['id']?>" class="btn btn-success">actualizar</a>
                </td>
                </tr>
            <?php }?>
            
            </tbody>
        </table>
        <a href="logout.php" class="btn btn-primary">cerrar sesion</a>
    </div>
</body>

</html>