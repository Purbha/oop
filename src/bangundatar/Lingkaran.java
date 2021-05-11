package bangundatar;
/* @author Irsyad */
public class Lingkaran extends BangunDatar{
    int r;

    public Lingkaran(int r) {
        this.r = r;
    }
    
    @Override
    public float Luas() {
        //Math.PI bertipe double;
        return (float) (this.r * this.r * Math.PI);
    }
    
    @Override
    public float Kell() {
        //Math.PI bertipe double;
        return (float) (2 * r * Math.PI);
    }
    
}
