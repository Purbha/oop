package innerclass;
/* @author Irsyad */
public class Test5 {
    
    public static void main(String[] args) {
        KelasLuar5 kl = new KelasLuar5();
        System.out.println("Test Access Outer Class From Inner Class");
        KelasLuar5.KelasDalam kd = kl.new KelasDalam();
        int c = kl.a + kd.ambil_A();
        System.out.println("Nilai variable a + variable a adalah: "
                + c);
    }
    
}
