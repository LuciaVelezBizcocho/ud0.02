package org.example.Prueba.Laboral.Factory;

import org.example.Prueba.Laboral.Comandos.Comando;
import org.example.Prueba.Laboral.Comandos.ComandoBuscar;
import org.example.Prueba.Laboral.Comandos.ComandoConsultarSalario;
import org.example.Prueba.Laboral.Comandos.ComandoCrear;
import org.example.Prueba.Laboral.Comandos.ComandoEditar;
import org.example.Prueba.Laboral.Comandos.ComandoListar;

/**
 * Patrón Factory: crea el comando adecuado a partir del parámetro "accion".
 *
 * @author Lucia
 */
public class FabricaComandos {

    /**
     * Devuelve el comando asociado a una acción.
     *
     * @param accion valor del parámetro "accion" de la petición
     * @return el comando, o null si la acción no existe
     */
    public Comando obtenerComando(String accion) {

        if (accion == null) {
            return null;
        }

        switch (accion) {
            case "listar":
                return new ComandoListar();

            case "crear":
                return new ComandoCrear();

            case "buscar":
            case "buscarEmpleados":
                return new ComandoBuscar();

            case "editar":
            case "actualizar":
                return new ComandoEditar();

            case "salario":
            case "consultarSalario":
                return new ComandoConsultarSalario();

            default:
                return null;
        }
    }
}