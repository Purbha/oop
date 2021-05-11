package lat_modif1;
/* @author Irsyad */
public class Lat12 extends Lat6{
    public static void main(String[] args) {
        Lat6 obj = new Lat6();
        System.out.println("Data Mobil");
        System.out.println("=====================");
        System.out.println("Merk       : " + obj.merk);
        System.out.println("Model      : " + obj.model);
        
        //Ini adalah Protected - Package 
        System.out.println("Tipe       : " + obj.tipe);
        System.out.println("Bahan Bakar: " + obj.bahanBakar);
        
        //Ini adalah Protected - Subclass (Same Package)
        Lat12 obj2 = new Lat12();
        System.out.println("Tipe       : " + obj2.tipe);
        System.out.println("Bahan Bakar: " + obj2.bahanBakar);
        
    }
}
