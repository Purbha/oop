package oop.lat_game;
/* @author Irsyad */
public class Musuh {
    
    protected String name;
    protected int hp;
    protected int attackPoin;
    
    protected void attack() {
        System.out.println(getClass().getSimpleName() + " menyerang!");
        System.out.println("Kekuatan serangan adalah: " + attackPoin);
    }
    
    protected void garis() {
        System.out.println("=========================================");
    }
    
}
