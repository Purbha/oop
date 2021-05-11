package lat_enum;
/* @author Irsyad */
public class LatEnum5 {
    
    static void Garis() {
            System.out.println("===============================");
    }
    
    public static void main(String[] args) {
        System.out.println("Test Enum");
        Garis();
        Pemain pemain = new Pemain();
        pemain.setNama("Irsyad");
        pemain.setHealthPoin(0);
        pemain.setKcp(Pemain.Kecepatan.KENCANG);
        pemain.run();
        Garis();
        if(pemain.isDead()){
            System.out.println("Game Over");
        }
        
    }
    
}
