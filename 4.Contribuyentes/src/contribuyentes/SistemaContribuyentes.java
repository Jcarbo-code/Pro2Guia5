package contribuyentes;

import java.util.ArrayList;

public class SistemaContribuyentes {

    protected ArrayList<Contribuyente> contribuyentes;

    public int calcularRecaudacion() {
        int recaudacion = 0;
        for (int i = 0; i < contribuyentes.size(); i++) {
            recaudacion += contribuyentes.get(i).abona();
        }
        return recaudacion;
    }
}
