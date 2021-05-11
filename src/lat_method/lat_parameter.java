package lat_method;

/*@author Irsyad*/
public class lat_parameter {
    
    public void gasPoll() {
        System.out.println("Mobil ini sedang di gasPoll");
    }
    
    private static void kecepatan(int topSpeed) {
        System.out.println("Top Speed mobil ini adalah: "
                + topSpeed);
    }
    
    public static void main(String[] args) {
        lat_parameter lp = new lat_parameter();
        lp.gasPoll();
        //Memanggil method dengan parameter
        lat_parameter.kecepatan(200);
    }
    
}
