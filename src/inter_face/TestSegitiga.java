package inter_face;
/* @author Irsyad */
public class TestSegitiga {
    
    private static void Garis() {
        System.out.println("================================");
    }
    
    public static void main(String[] args) {
        System.out.println("Test Multiple Interface");
        Garis();
        int alas = 3;
        int tinggi = 4;
        System.out.println("Alas segitiga siku-siku adalah "
                + alas);
        System.out.println("Tinggi segitiga siku-siku adalah "
                + tinggi);
        Garis();
        SegitigaSikuSiku siku = new SegitigaSikuSiku();
        siku.setAlas(alas);
        siku.setTinggi(tinggi);
        System.out.println("Luas segitiga siku-siku adalah "
                + siku.Luas());
        System.out.println("Keliling segitiga siku-siku adalah "
                + siku.Kell());   
    }
    
}
