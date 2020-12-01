package interfaz;

/**
 *
 * @author alfre
 */
public class InstrumentoViento implements instrumentoMusical{
    /**
     * funcion tocar
     */
    @Override
    public void tocar(){
            System.out.println("estoy tocando "
                    + "un instrumento de viento");
    }
    /**
     * funcion afinar
     */
    @Override
    public void afinar(){
        System.out.println("estoy afinando un"
                + " instrumento de viento");
    }
    /**
     * 
     * @return  tipo de instrumento
     */
    @Override
    public String tipoInstrumento(){
    return "intrumento de viento";
    }
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
