package cereales;

public class Pastura extends Cereal {

    private int supMin;

    public int getSupMin() {
        return supMin;
    }

    public void setSupMin(int supMin) {
        this.supMin = supMin;
    }

    public boolean acepta(Lote l) {
        if (l.getSuperficie() > supMin) {
            return super.acepta(l);
        }
        return false;
    }

}
