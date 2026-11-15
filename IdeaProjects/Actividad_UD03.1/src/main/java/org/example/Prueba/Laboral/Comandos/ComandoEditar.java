package org.example.Prueba.Laboral.Comandos;

import org.example.Prueba.Laboral.BD.EmpleadoDAO;
import org.example.Prueba.Laboral.modelo.Empleado;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Comando que modifica un empleado.
 * Por GET muestra el formulario con los datos actuales; por POST guarda los
 * cambios (el sueldo se recalcula en el DAO) y redirige al listado.
 *
 * @author Lucia
 */
public class ComandoEditar implements Comando {
    private final EmpleadoDAO dao = new EmpleadoDAO();

    @Override
    public void ejecutar(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {

        if ("GET".equalsIgnoreCase(request.getMethod())) {
            request.setAttribute("empleado", dao.buscar(request.getParameter("dni")));
            request.getRequestDispatcher("/WEB-INF/views/editar.jsp")
                    .forward(request, response);
            return;
        }

        String dniOriginal = request.getParameter("dniOriginal");
        char sexo = request.getParameter("sexo").toUpperCase().charAt(0);

        Empleado empleado = new Empleado(
                request.getParameter("nombre"),
                request.getParameter("dni"),
                sexo,
                Integer.parseInt(request.getParameter("anyos")),
                Integer.parseInt(request.getParameter("categoria")));

        dao.actualizar(dniOriginal, empleado);

        response.sendRedirect(request.getContextPath()
                + "/empleados?accion=listar&msg=actualizado");
    }
}