package practica;

/**
 *
 * @author alfre
 */
public class MPOOP75 {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("6*****************");
        Pais pais=new Pais();
        System.out.println(pais);
        
        Object objeto= new Object();
        System.out.println("objeto "+objeto);
        
        objeto=pais;
        System.out.println("objeto como pais "+objeto);
        
        objeto=new Pais();
        System.out.println("objeto como Pais "+objeto);
        
        System.out.println("2***********");
        //uso de instanceof
        
        pais= new Pais();
        System.out.println(pais);
        selectorPais(pais);
        
        pais= new Mexico();
        System.out.println(pais);
        selectorPais(pais);
        
        pais=new Canada();
        System.out.println(pais);
        selectorPais(pais);
    }
    
    public static void selectorPais(Pais pais){
        if(pais instanceof Mexico){
            System.out.println("el objeto es el pais Mexico");
        }else if(pais instanceof Canada){
            System.out.println("el objeto es el pais Canada");
        }else if(pais instanceof Pais){
            System.out.println("el objeto es un pais");
        }else{
            System.out.println("el objeto es otro pais");
        }
        
    }
}
