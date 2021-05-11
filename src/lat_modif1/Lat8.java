package lat_modif1;
/* @author Irsyad */
public class Lat8 extends Lat4{
    
    public static void main(String[] args) {
        Lat4 obj = new Lat4();
        
        //Ini adalah Private - Package
        System.out.println("Nama Lengkap: " + obj.namaDepan +
                " " + obj.namaBelakang);
        //System.out.println("Email: " + obj.email);
        //System.out.println("Umur: " + obj.umur);
        
        //Ini adalah Private - Subclass (Same Package)
        Lat8 obj2 = new Lat8();
        System.out.println("Nama Lengkap: " + obj2.namaDepan + 
                " " + obj.namaBelakang);
        //System.out.println("Email: " + obj2.email);
        //System.out.println("Umur: " + obj2.umur);   
    }  
}
