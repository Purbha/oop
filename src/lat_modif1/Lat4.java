package lat_modif1;
/*@author Irsyad*/
public class Lat4 {
    public String namaDepan = "Irsyad";
    public String namaBelakang = "Purbha";
    private String email = "irsyadpurbha.fst@uia.ac.id";
    private int umur = 35;
    
    public static void main(String[] args) {
        Lat4 obj = new Lat4();
        System.out.println("Nama Lengkap: " + obj.namaDepan +
                " " + obj.namaBelakang);
        obj.email = "irsyadpurbha@gmail.com";
        obj.umur = 36;
        System.out.println("Email: " + obj.email);
        System.out.println("Umur: " + obj.umur);   
    }  
}
