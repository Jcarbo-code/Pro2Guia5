package facturacion;

public class EmpleadoBono extends Empleado {

    protected int objetivo;
    protected int cantVentas;
    private int bono;

    public EmpleadoBono() {
        super();
        this.cantVentas = cantVentas;
        this.objetivo = 300;
    }

    public EmpleadoBono(String nombre, String apellido, int dni, int sueldoMensual, int porcenComicion) {
        super(nombre, apellido, dni, sueldoMensual);
        this.objetivo = porcenComicion;
        this.cantVentas = cantVentas;
    }

    public int getComicion() {
        return objetivo;
    }

    public void setComicion(int comicion) {
        this.objetivo = comicion;
    }

    @Override
    public int getSueldoMensual() {
        if (cantVentas >= objetivo) {
            return (sueldoMensual + bono);
        }
        return (sueldoMensual);
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }
}
