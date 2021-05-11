package abstrak;
/* @author Irsyad */
public class HitungPersegi {
    
    public static void main(String[] args) {
        System.out.println("Program Hitung Persegi");
        int panjang = 10;
        int lebar = 4;
        System.out.println("Panjang persegi adalah : " + panjang);
        System.out.println("Lebar persegi adalah   : " + lebar);
        Persegi persegi = new Persegi(panjang,lebar);
        System.out.println("Luas Persegi adalah    : " + persegi.Luas());      
    }
    
}
