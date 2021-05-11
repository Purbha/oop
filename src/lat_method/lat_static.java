package lat_method;
/*@author Irsyad*/
public class lat_static {
    
    // Static method
    static void methodStatic() {
        System.out.println("Method ini bisa diakses"
                + " tanpa harus membuat object.");
    }
    
    // Public method
    public void methodPublic() {
        System.out.println("Method ini hanya bisa diakses"
                + " dengan membuat object.");
    }
    
    public static void main(String[] args) {
        //Akses langsung
        methodStatic();
        //Buat object
        lat_static ls = new lat_static();
        ls.methodPublic();
    }
    
}
