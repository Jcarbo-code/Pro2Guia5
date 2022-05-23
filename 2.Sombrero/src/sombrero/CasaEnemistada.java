package sombrero;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {

    protected Casa enemigo;

    public CasaEnemistada() {
        super();
        this.enemigo = enemigo;
    }

    public CasaEnemistada(String nombre, String[] cualidades, int cupos, Casa enemigo) {
        super(nombre, cualidades, cupos);
        this.enemigo = enemigo;
    }

    public Casa getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Casa enemigo) {
        this.enemigo = enemigo;
    }

    public boolean potencialEnemigo(Alumno a) {
        return (!enemigo.cumpleCualidades(a));
    }

    @Override
    public boolean apto(Alumno a) {
        return (potencialEnemigo(a) && super.apto(a));
    }
}
