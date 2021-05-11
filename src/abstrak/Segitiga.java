package abstrak;

/* @author Irsyad */
public class Segitiga extends Shape{

    private int alas = 0;
    private int tinggi = 0;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
            
    @Override
    public float Luas() {
        return 0.5f * alas * tinggi;
    }
    
}
