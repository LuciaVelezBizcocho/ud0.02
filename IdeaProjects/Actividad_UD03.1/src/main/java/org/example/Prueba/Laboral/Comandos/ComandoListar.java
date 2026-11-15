package org.example.Prueba.Laboral.Comandos;

import org.example.Prueba.Laboral.BD.EmpleadoDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComandoListar implements Comando {
    private final EmpleadoDAO dao = new EmpleadoDAO();

    @Override
    public void ejecutar(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {

        request.setAttribute("lista", dao.listar());

        request.getRequestDispatcher("/WEB-INF/views/empleados.jsp")
                .forward(request, response);
    }
}