<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Gestión de nóminas</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/CSS/estilos.css">
</head>

<body>

<div class="container">

    <h1>Gestión de nóminas</h1>

    <p class="mensaje">Selecciona una opción:</p>

    <ul class="menu">
        <li>
            <a href="${pageContext.request.contextPath}/empleados?accion=listar">
                Mostrar todos los empleados
            </a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/empleados?accion=salario">
                Consultar el salario de un empleado
            </a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/empleados?accion=buscar">
                Buscar y modificar empleados
            </a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/empleados?accion=crear">
                Añadir un empleado
            </a>
        </li>
    </ul>

</div>

</body>
</html>