package bangundatar;
/* @author Irsyad */
public class TestSegitiga {
    
    public static void main(String[] args) {
        //Membuat object segitiga
        Segitiga s = new Segitiga(3, 10);
        System.out.println("Luas segitiga adalah: " + s.Luas());
        //Method Kell yang ada di class BangunDatar akan terpanggil
        System.out.println("Keliling segitiga adalah: " + s.Kell());
    }
    
}
