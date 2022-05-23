package sombrero;

import java.util.ArrayList;

public class CasaPura extends Casa {

    public CasaPura() {
        super();
    }

    public CasaPura(String nombre, String[] cualidades, int cupos) {
        super(nombre, cualidades, cupos);
    }

    @Override
    public boolean apto(Alumno a) {
        return (a.containFamiliar(this) && super.apto(a));
    }
}
