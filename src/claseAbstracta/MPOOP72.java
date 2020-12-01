package claseAbstracta;

/**
 *
 * @author alfre
 */
public class MPOOP72 {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("3**************");
        //clase abstracta
       // poligono poligono = new poligono(); esto esta mal
       poligono poligono=new triangulo();
        System.out.println(poligono);
        
        poligono=new cuadrilatero();
        System.out.println(poligono);
        
    }
    
}
