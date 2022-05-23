package cereales;

import java.util.ArrayList;
import java.util.List;

public class Lote {

    private int superficie;

    List<String> mins;

    public Lote() {
        superficie = 0;
        mins = new ArrayList<String>();
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    //NUNCA DEVOLVER EL LISTADO PORQUE DE AFUERA LO PUEDEN CAMBIAR
    /*public List<Mineral> getMins() {
	*	return mins;
	}*/
 /* NUNCA ASIGNAR UNA COLECCIONA ASI PORQUE SE PIERDE EL CONTROL
	public void setMins(List<Mineral> mins) {
		this.mins = mins;
	}
     */
    public void addMineral(String m) {
        if (!mins.contains(m)) {
            mins.add(m);
        }
    }

    public List<String> getMins() {
        List<String> aux = new ArrayList<String>();
        aux.addAll(mins);
        return aux;
        //List<String> aux = new ArrayList<String>(mins);
        //return aux;
    }

    public boolean contieneMineral(String s) {
        return mins.contains(s);
    }

    public void print() {
        System.out.println("EN LOTE " + mins.toString());
    }

    public boolean puedeSembrarse(Cereal c) {
        /*	si C es un CerealSolo
		  Hago A
		 pero si es una pastura
		    Hago B
         */
        return c.acepta(this);

    }

}
