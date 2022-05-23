package facturacion;

import java.util.ArrayList;

public class SistemaSueldos {

    protected ArrayList<Empleado> empleados;

    public int calcularGastoSueldos() {
        int gasto = 0;
        for (int i = 0; i < empleados.size(); i++) {
            gasto += empleados.get(i).getSueldoMensual();
        }
        return gasto;
    }
}
