<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Crear empleado</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/CSS/estilos.css">
</head>

<body>

<div class="container">

    <h1>Nuevo empleado</h1>

    <form action="${pageContext.request.contextPath}/empleados"
          method="post">

        <input type="hidden" name="accion" value="crear">

        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre"
               minlength="2" maxlength="20" required>

        <label for="dni">DNI:</label>
        <input type="text" id="dni" name="dni"
               minlength="9" maxlength="9" required>

        <label for="sexo">Sexo:</label>
        <select id="sexo" name="sexo" required>
            <option value="M">Masculino</option>
            <option value="F">Femenino</option>
        </select>

        <label for="anyos">Años trabajados:</label>
        <input type="number" id="anyos" name="anyos" min="0" required>

        <label for="categoria">Categoría:</label>
        <input type="number" id="categoria" name="categoria"
               min="1" max="10" required>

        <button type="submit">Guardar empleado</button>

    </form>

    <button class="volver"
            onclick="window.location.href='${pageContext.request.contextPath}/index.jsp'">
        Volver al menú
    </button>

</div>

</body>
</html>