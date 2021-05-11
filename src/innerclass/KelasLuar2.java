package innerclass;
/* @author Irsyad */
public class KelasLuar2 {

    int a = 30;
    
    private class KelasDalam  {
        int b = 40;   
    }   
    
    public static void main(String[] args) {
        System.out.println("Test Private Inner Class");
        KelasLuar2 kl = new KelasLuar2();
        //KelasDalam bisa diakses karena masih dalam class yang sama
        KelasLuar2.KelasDalam dalam = kl.new KelasDalam();
        int c = kl.a + dalam.b;
        System.out.println("Nilai variable a + variable b adalah: " + c);
    }
    
}
