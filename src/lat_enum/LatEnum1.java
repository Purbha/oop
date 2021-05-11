package lat_enum;
/* @author Irsyad */

enum levelPermainan {
    MUDAH,
    SEDANG,
    SULIT
}
public class LatEnum1 {
    
    public static void main(String[] args) {
        System.out.println("Test Enum");
        levelPermainan lp = levelPermainan.SULIT;
        System.out.println("Level permainan adalah " + lp);
    }
    
}
