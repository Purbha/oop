package innerclass;
/* @author Irsyad */
public class Test4 {
    
    public static void main(String[] args) {
        System.out.println("Test Static Inner Class");
        KelasLuar4 kl = new KelasLuar4();
        
        //Membuat objek KelasDalam tanpa melalui objek KelasLuar
        KelasLuar4.KelasDalam dalam = new KelasLuar4.KelasDalam();
        int c = kl.a + dalam.b;
        System.out.println("Nilai variable a + variable b adalah: " + c);
        
    }
    
}
