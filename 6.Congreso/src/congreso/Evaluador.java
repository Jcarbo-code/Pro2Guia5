package congreso;

import java.util.ArrayList;

public class Evaluador {

    protected ArrayList<Trabajo> trabajos;
    protected ArrayList<String> conocimientos;
    protected boolean clase;

    public Evaluador() {
        this.trabajos = new ArrayList<>();
        this.conocimientos = new ArrayList<>();
        this.clase = false;
    }

    public boolean isClase() {
        return clase;
    }

    public void setClase(boolean clase) {
        this.clase = clase;
    }

    public ArrayList<Trabajo> getTrabajos() {
        ArrayList<Trabajo> aux = new ArrayList<Trabajo>();
        aux.addAll(trabajos);
        return aux;
    }

    public void addTrabajo(Trabajo trabajo) {
        if (!trabajos.contains(trabajo)) {
            trabajos.add(trabajo);
        }
    }

    public ArrayList<String> getConocimientos() {
        ArrayList<String> aux = new ArrayList<String>();
        aux.addAll(conocimientos);
        return aux;
    }

    public void addConocimiento(String conocimiento) {
        if (!conocimientos.contains(conocimiento)) {
            conocimientos.add(conocimiento);
        }
    }

    boolean sabePalabra(String conocimiento) {
        return (conocimientos.contains(conocimiento));
    }

    public boolean puedeHacer(Trabajo t) {
        return t.esApto(this);
    }

    public String roll() {
        if (clase == false) {
            return "experto";
        }
        return "general";
    }

    public int cantTrabajos() {
        return trabajos.size();
    }
}
