package lat_modif1;
/* @author Irsyad */
public class Lat11 extends Lat5{
    
    public static void main(String[] args) {
        Lat5 obj = new Lat5();
        System.out.println("Nama lengkap saya adalah: " + obj.namaDepan +
                " " + obj.namaBelakang);
        
        //Ini adalah Default - Package
        System.out.println("Email saya adalah: " + obj.email);
        System.out.println("Dan umur saya adalah: " + obj.umur);
        
        //Ini adalah Default - Subclass (Same Pakcage)
        Lat11 obj2 = new Lat11();
        System.out.println("Email saya adalah: " + obj2.email);
        System.out.println("Dan umur saya adalah: " + obj2.umur);
        
    }
    
}
