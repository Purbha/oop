package abstrak;
/* @author Irsyad */
public class Kucing extends Hewan{
    
    public static void main(String[] args) {
        System.out.println("Test Abstract Classes and Methods");
        System.out.println("====================================");
        Kucing kucing = new Kucing();
        kucing.Tidur();
        kucing.suaraHewan();
    }

    @Override
    public void suaraHewan() {
        System.out.println("Suara kucing adalah: Meong.. Meong..");
    }
     
}
