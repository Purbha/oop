package oop.lat_inherit;
/* @author Irsyad */
public class MobilV1 extends KendaraanV1{
    
    private String namaModel;
    
    public static void main(String[] args) {
        MobilV1 mv = new MobilV1();
        mv.Klakson(); mv.namaModel = "BRIO";
        System.out.println("Merk: " + mv.merk +
                " Model: " + mv.namaModel);
    }
    
}
