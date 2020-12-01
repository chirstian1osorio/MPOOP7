package herencia;
/**
 *
 * @author alfre
 */
public class triangulo extends poligono{
    private int alpha;
    private int beta;
    private int gamma;
    private float a;
    private float b;
    private float c;
    private float base;
    private float alt;

    public triangulo() {
    }
    /**
     * 
     * @param a lado
     * @param b lado
     * @param c lado
     */
    public triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAlt() {
        return alt;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "triangulo{" + "alpha=" + 
                alpha + ", beta=" + beta +
                ", gamma=" + gamma + ", a=" + 
                a + ", b=" + b + ", c=" + c +
                ", base=" + base + ", alt=" +
                alt + '}';
    }
 
}
