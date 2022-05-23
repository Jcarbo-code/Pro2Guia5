package congreso;

import java.util.ArrayList;

public class Trabajo {

    protected ArrayList<String> palabrasClaves;

    public Trabajo() {
        this.palabrasClaves = new ArrayList<>();
    }

    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> aux = new ArrayList<String>();
        aux.addAll(palabrasClaves);
        return aux;
    }

    public void addPalabraClave(String palabra) {
        if (!palabrasClaves.contains(palabra)) {
            palabrasClaves.add(palabra);
        }
    }

    public boolean esApto(Evaluador e) {
        for (int i = 0; i < palabrasClaves.size(); i++) {
            if (!e.sabePalabra(palabrasClaves.get(i))) {
                return false;
            }
        }
        return true;
    }
}
