package congreso;

public class Poster extends Trabajo {

    public Poster() {
        super();
    }

    @Override
    public boolean esApto(Evaluador e) {
        for (int i = 0; i < this.palabrasClaves.size(); i++) {
            if (e.sabePalabra(palabrasClaves.get(i))) {
                return true;
            }
        }
        return false;
    }
}
