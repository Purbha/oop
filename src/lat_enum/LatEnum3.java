package lat_enum;
/* @author Irsyad */
public class LatEnum3 {
    
    enum levelPermainan {
        MUDAH,
        SEDANG,
        SULIT
    }
    
    public static void main(String[] args) {
        System.out.println("Test Enum");
        levelPermainan lp = levelPermainan.SEDANG;
        
        switch(lp) {
            case MUDAH:
                System.out.println("Level permainan adalah MUDAH.");
                break;
            case SEDANG:
                System.out.println("Level permainan adalah SEDANG.");
                break;
            default:
                System.out.println("Level permainan adalah SULIT.");
                break;                
        }
        /*
        levelPermainan coba[] = new levelPermainan[10];
        System.out.println("");
        levelPermainan coba[] = {
            levelPermainan.MUDAH,
            levelPermainan.SEDANG,
            levelPermainan.MUDAH,
            levelPermainan.MUDAH,
            levelPermainan.MUDAH,
            levelPermainan.MUDAH,
        };
        for(int i = 0; i<=5; i++){
            System.out.println("Nilai " + i + " adalah: " + coba[i]);                  
        }
        */
    }
    
}
