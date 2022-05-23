package contribuyentes;

public class ContribuyenteFacturador extends Contribuyente {

    protected int facturacion;
    protected float facturaPorcent;
    protected float impuestosPorcent;

    public ContribuyenteFacturador(String nombre, int id, int impuestos, int facturacion, float facturaPorcent, float impuestosPorcent) {
        super(nombre, id, impuestos);
        this.facturacion = facturacion;
        this.facturaPorcent = facturaPorcent;
        this.impuestosPorcent = impuestosPorcent;
    }

    public int getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(int facturacion) {
        this.facturacion = facturacion;
    }

    public float getFacturaPorcent() {
        return facturaPorcent;
    }

    public void setFacturaPorcent(float facturaPorcent) {
        this.facturaPorcent = facturaPorcent;
    }

    public float getImpuestosPorcent() {
        return impuestosPorcent;
    }

    public void setImpuestosPorcent(float impuestosPorcent) {
        this.impuestosPorcent = impuestosPorcent;
    }

    @Override
    public float abona() {
        return (getImpuestos() * impuestosPorcent) + (facturacion * facturaPorcent);
    }
}
