package lat_enum;
/* @author Irsyad */
public class LatEnum4 {
    
    enum levelPermainan {
        MUDAH,
        SEDANG,
        SULIT
    }
    
    public static void main(String[] args) {
        System.out.println("Test Enum");
        for(levelPermainan lp : levelPermainan.values()) {
            System.out.println("Level permainan adalah " + lp);
        }
    }
    
}
