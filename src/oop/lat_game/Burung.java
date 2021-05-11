package oop.lat_game;
/* @author Irsyad */
public class Burung extends Musuh{

    public Burung(String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
        System.out.println(getClass().getSimpleName() + " diinisialisasi.");
    }
    
    void Terbang() {
         System.out.println(getClass().getSimpleName() +
            " bisa terbang. HP " + getClass().getSimpleName() + 
            " adalah: " + hp);       
    }
    
    void Lompat() {
        System.out.println(getClass().getSimpleName() +
            " bisa lompat. Nama " + getClass().getSimpleName() + 
            " adalah: " + name);

    }
    
    void Jalan() {
        System.out.println(getClass().getSimpleName() +
            " bisa jalan-jalan.");
    }
    
}
