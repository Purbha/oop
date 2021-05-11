package abstrak;
/* @author Irsyad */
public class Lingkaran extends Shape{
    
    private int jari = 0;

    public Lingkaran(int jari) {
        this.jari = jari;
    }
    
    @Override
    public float Luas() {
        return (float) (Math.PI * jari * jari);
    }
    
}
