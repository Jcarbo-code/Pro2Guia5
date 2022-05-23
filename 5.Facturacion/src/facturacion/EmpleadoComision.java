package facturacion;

public class EmpleadoComision extends Empleado {

    protected int porcenComicion;
    protected int ventas;

    public EmpleadoComision() {
        super();
        this.ventas = ventas;
        this.porcenComicion = 3;
    }

    public EmpleadoComision(String nombre, String apellido, int dni, int sueldoMensual, int porcenComicion) {
        super(nombre, apellido, dni, sueldoMensual);
        this.porcenComicion = porcenComicion;
        this.ventas = ventas;
    }

    public int getComicion() {
        return porcenComicion;
    }

    public void setComicion(int comicion) {
        this.porcenComicion = comicion;
    }

    @Override
    public int getSueldoMensual() {
        return (sueldoMensual + (getVentas() * (porcenComicion / 100)));
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}
