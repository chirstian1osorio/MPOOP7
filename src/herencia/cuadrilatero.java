package herencia;
/**
 *
 * @author alfre
 */
public class cuadrilatero extends poligono{
    
    private int alpha;
    private int betha;
    private float a;
    private float b;
    private float base;
    private float alt;

    public cuadrilatero() {
    }
    /**
     * 
     * @param a lado
     * @param b lado
     */
    public cuadrilatero(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBetha() {
        return betha;
    }

    public void setBetha(int betha) {
        this.betha = betha;
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
        return "cuadrilatero{" + 
                "alpha=" + alpha + 
                ", betha=" + betha + 
                ", a=" + a + ", b=" + 
                b + ", base=" + base + 
                ", alt=" + alt + '}';
    }

}
