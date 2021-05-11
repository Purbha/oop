package lat_attribute;
/*@author Irsyad*/
public class lat2 {
    final int x = 10;
    public static void main(String[] args) {
        lat2 obj = new lat2();
        System.out.println("Nilai x adalah: " + obj.x);
        //override existing values:
        //obj.x = 5; //Akan terjadi error
        System.out.println("Nilai x adalah: " + obj.x);
    }
    
}
