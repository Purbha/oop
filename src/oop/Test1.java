package oop;
/**
 * @author IRSYAD
 */
public class Test1 {
    
    public static void main(String[] args) {
        KucingV2 persian = new KucingV2();
        persian.setColor("Putih");
        persian.setHeight(24.0);
        persian.setLength(46.0);
        persian.setWeight(2.0);
        KucingV2 bengal = new KucingV2("Coklat", 22.0, 39.0, 2.3);
        KucingV2 anggora  = new KucingV2("Abu-abu", 25.0, 41.0, 2.4);
        System.out.println("Data Kucing Bengal: \n" +
                "Warna --> " + bengal.getColor() + "\n" +
                "Tinggi --> " + bengal.getHeight() + "\n" +
                "Panjang --> " + bengal.getLength() + "\n" + 
                "Berat --> " + bengal.getWeight());
    }
    
}
