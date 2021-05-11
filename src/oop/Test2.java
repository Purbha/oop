package oop;
/* @author Irsyad */
public class Test2 {
    
    public static void main(String[] args) {
        KucingV3 kv = new KucingV3();
        kv.purring();
        kv.eat();
        kv.eat();
        kv.eat();
        System.out.println("Berat kucing sekarang adalah: " +
                kv.getWeight());
    }
    
}
