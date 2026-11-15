package org.example.Prueba.Laboral.Comandos;

import org.example.Prueba.Laboral.BD.EmpleadoDAO;
import org.example.Prueba.Laboral.modelo.Empleado;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Comando que da de alta un empleado.
 * Por GET muestra el formulario de alta; por POST inserta el empleado
 * y redirige al listado con un mensaje de confirmación.
 *
 * @author Lucia
 */
public class ComandoCrear implements Comando {
    private final EmpleadoDAO dao = new EmpleadoDAO();

    @Override
    public void ejecutar(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {

        if ("GET".equalsIgnoreCase(request.getMethod())) {
            request.getRequestDispatcher("/WEB-INF/views/crear.jsp")
                    .forward(request, response);
            return;
        }

        String nombre = request.getParameter("nombre");
        String dni = request.getParameter("dni");
        char sexo = request.getParameter("sexo").toUpperCase().charAt(0);
        int anyos = Integer.parseInt(request.getParameter("anyos"));
        int categoria = Integer.parseInt(request.getParameter("categoria"));

        dao.insertar(new Empleado(nombre, dni, sexo, anyos, categoria));

        response.sendRedirect(request.getContextPath()
                + "/empleados?accion=listar&msg=creado");
    }
}