package inter_face;
/* @author Irsyad */
public class SegitigaSikuSiku implements InterfaceKell, InterfaceLuas{

    private int alas = 0;
    private int tinggi = 0;

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    private double setMiring() {
        double kuadratAlas = Math.pow(alas,2);
        double kuadratTinggi = Math.pow(tinggi,2);
        double sisiMiring = Math.sqrt(kuadratAlas + kuadratTinggi);
        return sisiMiring;
    } 
    
    @Override
    public float Kell() {
        return (float) setMiring() + alas + tinggi;
    }

    @Override
    public float Luas() {
        return 0.5f * alas * tinggi;
    }
    
}
