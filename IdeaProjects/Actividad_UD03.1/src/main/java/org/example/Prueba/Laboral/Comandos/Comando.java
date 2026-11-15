package org.example.Prueba.Laboral.Comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Patrón Command: cada operación de la aplicación se encapsula en una clase
 * que implementa esta interfaz.
 *
 * @author Lucia
 */
public interface Comando {

    /**
     * Ejecuta la operación.
     *
     * @param request  petición HTTP recibida
     * @param response respuesta HTTP
     * @throws Exception si falla la operación
     */
    void ejecutar(HttpServletRequest request,
                  HttpServletResponse response) throws Exception;
}