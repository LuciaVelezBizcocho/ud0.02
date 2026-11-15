package org.example.Prueba.Laboral.Strategy;

import org.example.Prueba.Laboral.modelo.Empleado;

/**
 * Patrón Strategy: define cómo se calcula el sueldo de un empleado.
 *
 * @author Lucia
 */
public interface EstrategiaCalculoSueldo {

    /**
     * Calcula el sueldo de un empleado.
     *
     * @param empleado empleado del que se calcula el sueldo
     * @return sueldo calculado
     */
    int calcular(Empleado empleado);
}