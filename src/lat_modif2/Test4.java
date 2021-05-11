package lat_modif2;

import lat_modif1.*;

/*@author Irsyad*/
public class Test4 extends Lat4{
    
    public static void main(String[] args) {
        
        Lat4 obj = new Lat4();
        System.out.println("Nama Lengkap: " + obj.namaDepan +
                " " + obj.namaBelakang);
        
        //Ini adalah Private - World
        //System.out.println("Email: " + obj.email);
        //System.out.println("Umur: " + obj.umur);
        
        //Ini adalah Private - Subclass (Diff Package)
        Test4 obj2 = new Test4();
        System.out.println("Nama Lengkap: " + obj2.namaDepan +
                " " + obj2.namaBelakang);
                
        //System.out.println("Email: " + obj2.email);
        //System.out.println("Umur: " + obj2.umur);
        
    }
}
