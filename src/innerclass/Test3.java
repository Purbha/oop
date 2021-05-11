package innerclass;

/* @author Irsyad */
public class Test3{
    
    public static void main(String[] args) {
        System.out.println("Test Protected Inner Class");
        KelasLuar3 kl = new KelasLuar3();
        KelasLuar3.KelasDalam dalam = kl.new KelasDalam();
        int c = kl.a + dalam.b;
        System.out.println("Nilai variable a + variable b adalah: " + c);    
    }
}
