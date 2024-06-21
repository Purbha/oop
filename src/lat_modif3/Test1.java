package lat_modif3;
/* @author Irsyad */
// Meng-extends class Lat1 akan menyebabkan error karena class Lat1 bertipe final.
//public class Test1 extends Lat1{
public class Test1{   
    //Hanya bisa bisa diakses dalam class yang sama
    private String namaModel;  
    public static void main(String[] args) {
        Test1 mobil1 = new Test1();
        mobil1.namaModel = "MOBILIO";
/*
Method Klakson tidak ada di class Test1, adanya di class Lat1. "mobil1.Klakson()"
hanya bisa dijalankan jika kelasnya bisa di inheritance.
*/
//mobil1.Klakson();  
/*
Variable merk tidak ada di class Test1, adanya di class Lat1.
*/
//System.out.println(mobil1.merk + " " + mobil1.namaModel);
        System.out.println(mobil1.namaModel);
        Lat1 obj1 = new Lat1();   
        System.out.println(obj1.merk + " " + mobil1.namaModel);
        obj1.Klakson();
    }
    
}
