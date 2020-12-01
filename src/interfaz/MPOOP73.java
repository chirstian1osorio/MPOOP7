package interfaz;

/**
 *
 * @author alfre
 */
public class MPOOP73 {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("4**************");
        //interfaz
        //instrumentoMusical instrumento=new instrumentoMusical(); esto no
        instrumentoMusical instrumento;
        instrumento= new InstrumentoViento();
        instrumento.afinar();
        System.out.println(instrumento);
        
        instrumento = new Flauta();
        instrumento.afinar();
        System.out.println(instrumento);
    }
}
