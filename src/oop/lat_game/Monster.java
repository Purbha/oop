package oop.lat_game;
/* @author Irsyad */
public class Monster extends Musuh{

    public Monster(String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
        System.out.println(getClass().getSimpleName() + " diinisialisasi.");
    }
    
    void Memukul() {
        System.out.println(getClass().getSimpleName() +
                " bisa memukul. HP " + getClass().getSimpleName() + 
                " adalah: " + hp);
    }
    
    void Lompat() {
        System.out.println(getClass().getSimpleName() +
                " bisa lompat. Nama " + getClass().getSimpleName() + 
                " adalah: " + name);
    }
    
}
