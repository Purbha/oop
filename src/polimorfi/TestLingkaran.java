package polimorfi;

import java.text.DecimalFormat;

/* @author Irsyad */
public class TestLingkaran {
    
    public static void main(String[] args) {
        float jari = 7;
        double diameter = 14;
        Lingkaran l = new Lingkaran();
        //Format Desimal
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Luas Lingkaran: "
                + df.format(l.luas(jari)));
        System.out.println("Luas Lingkaran: "
                + df.format(l.luas(diameter)));
    }
    
}
