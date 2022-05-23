package contribuyentes;

public class Contribuyente {

    protected String nombre;
    protected int id;
    protected int impuestos;

    public Contribuyente(String nombre, int id, int impuestos) {
        this.nombre = nombre;
        this.id = id;
        this.impuestos = impuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public float abona() {
        return getImpuestos();
    }
}
