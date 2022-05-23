package cereales;

import java.util.List;

public class Cereal {

    protected String nombre;
    protected List<String> minsR;

    public void addMineralRequerido(String s) {
        if (!minsR.contains(s)) {
            minsR.add(s);
        }
    }

    public boolean requiereMineral(String s) {
        return minsR.contains(s);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean acepta(Lote l) {

        for (int i = 0; i < minsR.size(); i++) {
            if (!l.contieneMineral(minsR.get(i))) {
                return false;
            }
        }
        return true;

    }
}
