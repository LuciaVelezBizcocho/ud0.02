package org.example.Prueba.Laboral.Comandos;

import org.example.Prueba.Laboral.BD.EmpleadoDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComandoBuscar implements Comando {
    private final EmpleadoDAO dao = new EmpleadoDAO();

    @Override
    public void ejecutar(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {

        if ("buscar".equals(request.getParameter("accion"))) {
            request.getRequestDispatcher("/WEB-INF/views/buscar.jsp")
                    .forward(request, response);
            return;
        }

        request.setAttribute("lista", dao.buscarPorFiltros(
                request.getParameter("nombre"),
                request.getParameter("dni"),
                request.getParameter("sexo"),
                request.getParameter("categoria"),
                request.getParameter("anyos")));

        request.getRequestDispatcher("/WEB-INF/views/resultados.jsp")
                .forward(request, response);
    }
}