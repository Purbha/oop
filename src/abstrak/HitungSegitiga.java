package abstrak;
/* @author Irsyad */
public class HitungSegitiga {
    
    public static void main(String[] args) {
        System.out.println("Program Hitung Segitiga");
        int alas = 10;
        int tinggi = 3;
        System.out.println("Alas segitiga adalah  : " + alas);
        System.out.println("Tinggi segitiga adalah: " + tinggi);
        Segitiga segitiga = new Segitiga(alas, tinggi);
        System.out.println("Luas Segitiga adalah  : " + segitiga.Luas());      
    }
    
}
