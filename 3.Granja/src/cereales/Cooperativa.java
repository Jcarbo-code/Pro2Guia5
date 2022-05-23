package cereales;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {

    List<Cereal> cereales;
    List<Lote> lotes;
    List<String> minsPrim;

    public boolean puedeSembrarse(Lote l, Cereal c) {
        return c.acepta(l);
    }

    public List<Cereal> getCerealesQuePuedenEn(Lote l) {
        List<Cereal> salida = new ArrayList<Cereal>();
        for (int i = 0; i < cereales.size(); i++) {
            Cereal caux = cereales.get(i);
            if (caux.acepta(l)) {
                salida.add(caux);
            }
        }
        return salida;
    }

    public List<Lote> getLotesSirvenPara(Cereal c) {
        List<Lote> salida = new ArrayList<Lote>();
        for (int i = 0; i < lotes.size(); i++) {
            Lote caux = lotes.get(i);
            if (caux.puedeSembrarse(c)) {
                salida.add(caux);
            }
        }
        return salida;
    }

    public boolean esEspecial(Lote l) {
        for (int i = 0; i < minsPrim.size(); i++) {
            String min = minsPrim.get(i);
            if (l.contieneMineral(min)) {
                return true;
            }
        }
        return false;
    }
}
