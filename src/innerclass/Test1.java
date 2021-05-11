package innerclass;
/* @author Irsyad */
public class Test1 {
    
    public static void main(String[] args) {
        //Untuk mengakses variable a maka buat object KelasLuar
        KelasLuar kelasLuar = new KelasLuar();
        //Untuk mengakses variable b maka buat object KelasDalam
        KelasLuar.KelasDalam dalam = kelasLuar.new KelasDalam();
        //===============================//
        int c = kelasLuar.a + dalam.b;
        System.out.println("Nilai variable a + variable b adalah: " + c);
    }
    
}
