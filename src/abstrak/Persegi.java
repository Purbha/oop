package abstrak;
/* @author Irsyad */
public class Persegi extends Shape{

    private int panjang = 0;
    private int lebar = 0;

    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public float Luas() {
        return panjang * lebar;
    }
    
}
