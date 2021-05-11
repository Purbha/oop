package lat_enum;
/* @author Irsyad */
public class LatEnum2 {
    
    enum levelPermainan {
        MUDAH,
        SEDANG,
        SULIT
    }
    
    public static void main(String[] args) {
        System.out.println("Test Enum");
        levelPermainan lp = levelPermainan.SULIT;
        System.out.println("Level permainan adalah " + lp);
    }
    
}
