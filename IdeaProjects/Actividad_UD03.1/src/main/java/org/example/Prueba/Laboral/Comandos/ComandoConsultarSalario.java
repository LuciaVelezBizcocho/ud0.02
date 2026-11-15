package org.example.Prueba.Laboral.Comandos;

import org.example.Prueba.Laboral.BD.EmpleadoDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComandoConsultarSalario implements Comando {
    private final EmpleadoDAO dao = new EmpleadoDAO();

    @Override
    public void ejecutar(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {

        String dni = request.getParameter("dni");

        request.setAttribute("dni", dni);
        if (dni != null) {
            request.setAttribute("sueldo", dao.obtenerSueldo(dni));
        }

        request.getRequestDispatcher("/WEB-INF/views/salario.jsp")
                .forward(request, response);
    }
}