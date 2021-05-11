package lat_modif3;

/* @author Irsyad  */
public class Test2 {
    
    public static void main(String[] args) {
        //Buat object Lat3
        Lat3 obj1 = new Lat3();
        /*
            Buat object Lat2, akan terjadi error karena
            Lat2 bersifat abstract
        */
        //Lat2 obj2 = new Lat2();
        /*
            Variable namaDepan ada di Lat2 tetapi bisa diakses
            karena Lat3 merupakan turunan dari Lat2 (extends)
        */
        System.out.println("Nama saya adalah: " +
                obj1.namaDepan + " " + obj1.namaBelakang);
        System.out.println("Jika ada tugas silakan dikirim ke " +
                obj1.email);
        System.out.println("Umur saya saat ini adalah: " +
                obj1.umur + " tahun");
    }
    
}
