package bangundatar;
/* @author Irsyad */
public class Persegi extends BangunDatar{
    
    int sisi;
    
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public float Luas() {
        return this.sisi * this.sisi;
    }
    
    @Override
    public float  Kell() {
        return this.sisi * 4;
    }
    
}
