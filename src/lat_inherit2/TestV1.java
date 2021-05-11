package lat_inherit2;

/*@author Irsyad*/
public class TestV1 {
    
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance");
        System.out.println("=============================");
        KucingV1 kv = new KucingV1();
        kv.Suara();
        kv.Makan();
        kv.Jalan();
        System.out.println("=============================");
        AnjingV1 av = new AnjingV1();
        av.Suara();
        av.Makan();
        av.Jalan();        
    }
}
