package inter_face;
/* @author Irsyad */
public class TestLingkaran {

    private static void Garis() {
        System.out.println("================================");
    }

    public static void main(String[] args) {
        System.out.println("Test Multiple Interface");
        Garis();
        int jari = 10;
        System.out.println("Panjang jari-jari lingkaran adalah "
                + jari);
        Garis();
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(jari);
        System.out.println("Luas lingkaran adalah "
                + lingkaran.Luas());
        System.out.println("Keliling lingkaran adalah "
                + lingkaran.Kell());   
    }
    
}
