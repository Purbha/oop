package tugas_inherit2;
import innerclass.KelasLuar3;

/* @author Irsyad */
//Extend ke KelasLuar3 agar seluruh membernya bisa diakses
public class Test1 extends KelasLuar3{
  
    //Extend ke KelasDalam agar variable b bisa diturunkan ke class aksesDalam
    public class aksesDalam extends KelasDalam {
    }
    
    public static void main(String[] args) {
        KelasLuar3 kl = new KelasLuar3();        
        /*
        Ketika kita membuat object dari KelasDalam maka
        akan terjadi error karena sifatnya yang protected access
        */
        //KelasLuar3.KelasDalam dalam = kl.new KelasDalam();
        //Buat object test1 untuk mengakses class aksesDalam
        Test1 test1 = new Test1();   
        //Buat object dalam untuk mengakses variable b nya
        Test1.aksesDalam dalam = test1.new aksesDalam();
        int c = dalam.b + kl.a;
        System.out.println("Nilai variable a + variable b adalah: " + c);
    }
    
}
    

