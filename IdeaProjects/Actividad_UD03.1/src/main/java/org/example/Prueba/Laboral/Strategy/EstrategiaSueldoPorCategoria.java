package org.example.Prueba.Laboral.Strategy;

import org.example.Prueba.Laboral.modelo.Empleado;

public class EstrategiaSueldoPorCategoria implements EstrategiaCalculoSueldo {

    private static final int[] SUELDO_BASE = {
            50000, 70000, 90000, 110000, 130000,
            150000, 170000, 190000, 210000, 230000
    };

    @Override
    public int calcular(Empleado empleado) {
        return SUELDO_BASE[empleado.getCategoria() - 1] + empleado.getAnyos() * 5000;
    }
}