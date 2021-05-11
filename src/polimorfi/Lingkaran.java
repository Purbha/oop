package polimorfi;
/* @author Irsyad */
public class Lingkaran {
    
    public float luas(float r) {
        return (float) (Math.PI * r * r);
    }
    
    public double luas(double d) {
        /*
        Luas lingkaran = Pi x radius x radius.
        Karena diameter lingkaran sama dua kali radiusnya,
        maka luas lingkaran dapat dinyatakan dengan rumus
        luas = 0.25 x Pi x diameter x diameter.
        */
        return (double) (0.25 * Math.PI * d * d);
    }
    
}
