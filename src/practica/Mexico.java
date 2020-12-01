package practica;

/**
 *
 * @author alfre
 */
public class Mexico extends Pais {
    private String idioma;
    private double pago;

    public Mexico() {
        //this.idioma="español";
    }
    /**
     * 
     * @param pago 
     */
    public Mexico(double pago) {
        this.pago = pago;
        this.idioma="español";
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Mexico{" + "idioma=" + 
                idioma + ", pago=" + 
                pago + '}';
    }
}
