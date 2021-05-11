package inter_face;
/* @author Irsyad */
public class TestPersegi {
    
    private static void Garis() {
        System.out.println("================================");
    }

    public static void main(String[] args) {
        System.out.println("Test Multiple Interface");
        Garis();
        int lebar = 3;
        int panjang = 4;
        System.out.println("Panjang persegi adalah "
                + panjang);
        System.out.println("Lebar persegi adalah "
                + lebar);
        Garis();
        Persegi persegi = new Persegi();
        persegi.setLebar(lebar);
        persegi.setPanjang(panjang);
        System.out.println("Luas persegi adalah "
                + persegi.Luas());
        System.out.println("Keliling persegi adalah "
                + persegi.Kell());   
    }
    
}
