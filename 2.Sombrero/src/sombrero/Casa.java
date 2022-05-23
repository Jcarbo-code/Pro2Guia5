package sombrero;

import java.util.ArrayList;

public class Casa {

    protected String nombre;
    protected ArrayList<String> cualidades;
    protected int cupos;
    protected final int cuposMax = 999;

    public Casa() {
        this.nombre = "Griffyndor";
        this.cualidades = new ArrayList<>();
        this.cupos = 1000;
    }

    public Casa(String nombre, String[] cualidades, int cupos) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.cupos = cupos;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public void addCualidades(String cualidad) {
        cualidades.add(cualidad);
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public boolean cumpleCualidades(Alumno a) {
        for (int i = 0; i < a.cualidades.size(); i++) {
            if (!a.containCualidad(cualidades.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean apto(Alumno a) {
        return ((a.getCasa() == null) && cupos < cuposMax && cumpleCualidades(a));
    }

    public void inscribir(Alumno alumno) {
        if (apto(alumno)) {                 // o usar   if (this.apto(alumno)) {
            alumno.setCasa(this);
            setCupos(getCupos() + 1);
        }
    }
}
