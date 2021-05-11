package lat_attribute;
/*@author Irsyad*/
public class lat1 {
    int x = 10;
    public static void main(String[] args) {
        lat1 obj = new lat1();
        System.out.println("Nilai x adalah: " + obj.x);
        //override existing values:
        obj.x = 5;
        System.out.println("Nilai x adalah: " + obj.x);
    }
}
