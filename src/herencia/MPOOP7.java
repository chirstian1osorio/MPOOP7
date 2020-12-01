package herencia;
/**
 *
 * @author alfre
 */
public class MPOOP7 {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        System.out.println("1************");
        
        poligono poligono=new poligono();
        System.out.println(poligono);
        
        Object objeto= new Object();
        System.out.println("objeto"+objeto);
        
        objeto=poligono;
        System.out.println("objeto como poligno "+objeto);
        
        objeto=new poligono();
        System.out.println("objeto como poligono "+objeto);
        
        System.out.println("2***************+++");
        //uso de instaceof
        
        poligono =new poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono=new cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
 
    }
    /**
     * 
     * @param poligono selector
     */
    public static void selectorPoligonos(poligono poligono){
        if(poligono instanceof triangulo){
            System.out.println("el objeto es un triangulo");
        }else if(poligono instanceof cuadrilatero){
            System.out.println("el objeto es un cuadrilateri");
        }else if(poligono instanceof poligono){
            System.out.println("el objeto es un poligono");
        }else{
            System.out.println("el objeto es otra figura");
        }
    }
    
}
