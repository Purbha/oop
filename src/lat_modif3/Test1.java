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
hanya bisa dijalankan klo kelasnya bisa di inheritance. Walaupun method
"Klakson" tipenya world tapi classnya tidak bisa dibuat object.
*/
//mobil1.Klakson();  
/*
Variable merk tidak ada di class Test1, adanya di class Lat1. Walaupun attributnya
protected yang artinya bisa diakses dalam package yang sama tapi classnya tidak bisa
dibuat object.
*/
//System.out.println(mobil1.merk + " " + mobil1.namaModel);
        System.out.println(mobil1.namaModel);
        Lat1 obj1 = new Lat1();   
    }
    
}
