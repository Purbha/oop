package tugas1;
import java.util.Scanner;
/* @author Irsyad */
public class Scanner1 {
    
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Masukan nama anda: ");
        /*
        nextLine adalah metode yang digunakan
        untuk membaca 1 baris.
        */
        String namaAnda = obj1.nextLine();
        System.out.println("Nama anda adalah: "
                + namaAnda);     
    }
    
}
