package innerclass;
/* @author Irsyad */
public class Test2 {
    
    public static void main(String[] args) {
        int c = 0;
        KelasLuar2 kelasLuar = new KelasLuar2();
        /*
        Ketika kita membuat object dari KelasDalam maka
        akan terjadi error karena sifatnya yang private access
        */
        //KelasLuar2.KelasDalam dalam = kelasLuar.new KelasDalam();
        //c = kelasLuar.a + dalam.b;
        System.out.println("Nilai variable a + variable b adalah: " + c);
    }
}
