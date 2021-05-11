package inter_face;
/* @author Irsyad */
public class Kucing implements Hewan{
    
    public static void main(String[] args) {
        System.out.println("Test Interface");
        System.out.println("====================================");
        Kucing kucing = new Kucing();
        kucing.Bobo();
        kucing.SuaraHewan();
    }

    @Override
    public void SuaraHewan() {
        System.out.println("Suara kucing adalah: Meong.. Meong..");
    }

    @Override
    public void Bobo() {
        System.out.println("Kucing sedang bobo Zzzz");
    }
    
}
