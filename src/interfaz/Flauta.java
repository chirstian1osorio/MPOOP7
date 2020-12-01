package interfaz;

/**
 *
 * @author alfre
 */
public class Flauta extends InstrumentoViento {

    public Flauta() {
    }
    /**
     * 
     * @return tipo de instrumento
     */
    @Override
    public String tipoInstrumento() {
        return "flauta";
    }
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }

}
