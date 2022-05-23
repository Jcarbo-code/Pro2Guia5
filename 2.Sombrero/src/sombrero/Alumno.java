package sombrero;

import java.util.ArrayList;

public class Alumno {

    protected ArrayList<String> cualidades;
    protected String nombre;
    protected ArrayList<Alumno> familiares;
    protected Casa casa;

    public Alumno(ArrayList<String> cualidades, String nombre, ArrayList<String> familiares) {
        this.cualidades = new ArrayList<>();
        this.nombre = nombre;
        this.familiares = new ArrayList<>();

    }

    public Alumno() {
        this.cualidades = new ArrayList<>();
        this.nombre = "harry porter";
        this.familiares = new ArrayList<>();
        this.casa = casa;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

    public void addCualidades(String cualidad) {
        cualidades.add(cualidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public ArrayList<Alumno> getFamilidares() {
        return familiares;
    }

    public void addFamilidares(Alumno familiar) {
        familiares.add(familiar);
    }

    public boolean containCualidad(String cualidad) {
        return cualidades.contains(cualidad);
    }

    public boolean containFamiliar(Casa casa) {
        for (int i = 0; i < familiares.size(); i++) {
            if (familiares.get(i).getCasa() == casa) {
                return true;
            }
        }
        return false;
    }
}
