<%@ page contentType="text/html;charset=UTF-8" %>

<%
    String error = (String) request.getAttribute("error");
%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Error</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/CSS/estilos.css">
</head>

<body>

<div class="container">

    <h1>Se ha producido un error</h1>

    <div class="error">
        <%= error != null ? error : "Error inesperado en la aplicación." %>
    </div>

    <button class="volver" onclick="history.back()">Volver</button>

    <button class="volver"
            onclick="window.location.href='${pageContext.request.contextPath}/index.jsp'">
        Volver al menú
    </button>

</div>

</body>
</html>