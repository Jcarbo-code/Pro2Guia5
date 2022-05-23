package facturacion;

public class Empleado {

    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int sueldoMensual;

    public Empleado() {
        this.nombre = "pepe";
        this.apellido = "argento";
        this.dni = 383999666;
        this.sueldoMensual = 150000;
    }

    public Empleado(String nombre, String apellido, int dni, int sueldoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
