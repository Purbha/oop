package lat_modif3;
/* @author Irsyad */
public class Test3 {
    
    public static void main(String[] args) {
        /*
            Bisa langsung memanggil methodnya tanpa harus membuat
            object terlebih dahulu.
        */
        Lat4.Method_Static();
        //Akan terjadi error karena method public.        
        //Lat4.Method_Public();
        /*
            Untuk memanggil method public harus membuat objek
            terlebih dahulu.
        */        
        Lat4 obj1 = new Lat4();
        obj1.Method_Public();
        /*
            Meskipun menimbulkan warning, pemanggilan static
            method tetap bisa dilakukan dengan cara melalui objek.
        */
        obj1.Method_Static();
    }
    
}
