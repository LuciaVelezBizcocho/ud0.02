<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.example.Prueba.Laboral.modelo.Empleado" %>

<%
    Empleado empleado = (Empleado) request.getAttribute("empleado");
%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Editar empleado</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/CSS/estilos.css">
</head>

<body>

<div class="container">

    <h1>Editar empleado</h1>

    <% if (empleado == null) { %>

    <div class="error">No se ha encontrado el empleado indicado.</div>

    <% } else { %>

    <form action="${pageContext.request.contextPath}/empleados"
          method="post">

        <input type="hidden" name="accion" value="actualizar">
        <input type="hidden" name="dniOriginal" value="<%= empleado.getDni() %>">

        <label for="dni">DNI:</label>
        <input type="text" id="dni" name="dni"
               value="<%= empleado.getDni() %>" readonly>

        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre"
               value="<%= empleado.getNombre() %>"
               minlength="2" maxlength="20" required>

        <label for="sexo">Sexo:</label>
        <select id="sexo" name="sexo" required>
            <option value="M" <%= empleado.getSexo() == 'M' ? "selected" : "" %>>Masculino</option>
            <option value="F" <%= empleado.getSexo() == 'F' ? "selected" : "" %>>Femenino</option>
        </select>

        <label for="anyos">Años trabajados:</label>
        <input type="number" id="anyos" name="anyos"
               min="0" value="<%= empleado.getAnyos() %>" required>

        <label for="categoria">Categoría:</label>
        <input type="number" id="categoria" name="categoria"
               min="1" max="10" value="<%= empleado.getCategoria() %>" required>

        <p class="mensaje">
            El sueldo se recalcula automáticamente al guardar.
        </p>

        <button type="submit">Guardar cambios</button>

    </form>

    <% } %>

    <button class="volver"
            onclick="history.back()">
        Volver
    </button>

    <button class="volver"
            onclick="window.location.href='${pageContext.request.contextPath}/index.jsp'">
        Volver al menú
    </button>

</div>

</body>
</html>