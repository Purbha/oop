package abstrak;
/* @author Irsyad */
public class HitungLingkaran {
    
    public static void main(String[] args) {
        System.out.println("Program Hitung Lingkaran");
        int jari = 10;
        System.out.println("Jari-jari lingkaran adalah  : " + jari);
        Lingkaran lingkaran = new Lingkaran(jari);
        System.out.println("Luas Lingkaran adalah       : " + lingkaran.Luas());      
    }
    
}
