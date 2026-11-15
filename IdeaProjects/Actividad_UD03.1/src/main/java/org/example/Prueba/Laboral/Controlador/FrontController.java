package org.example.Prueba.Laboral.Controlador;

import org.example.Prueba.Laboral.Comandos.Comando;
import org.example.Prueba.Laboral.Factory.FabricaComandos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Patrón Front Controller: único servlet de la aplicación (/empleados).
 * Recibe todas las peticiones y delega en el comando correspondiente.
 *
 * @author Lucia
 */
@WebServlet("/empleados")
public class FrontController extends HttpServlet {

    private final FabricaComandos fabrica = new FabricaComandos();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        procesarPeticion(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        procesarPeticion(request, response);
    }

    /**
     * Obtiene el comando de la acción solicitada y lo ejecuta. Si no hay
     * acción o no existe, vuelve al menú; si hay un error, muestra error.jsp.
     */
    private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }

        try {
            Comando comando = fabrica.obtenerComando(accion);

            if (comando == null) {
                response.sendRedirect(request.getContextPath() + "/index.jsp");
                return;
            }

            comando.ejecutar(request, response);

        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp")
                    .forward(request, response);
        }
    }
}