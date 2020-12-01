package practica;

/**
 *
 * @author alfre
 */
public class Canada extends Pais {
    
    private String idioma;
    private double salario;

    public Canada() {
    }
    /**
     * 
     * @param salario 
     */
    public Canada(double salario) {
        this.salario = salario;
        this.idioma="ingles";
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Canada{" + "idioma=" +
                idioma + ", salario=" + 
                salario + '}';
    }
}
