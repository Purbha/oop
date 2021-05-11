package oop.lat_game;
/* @author Irsyad */
public class Zombie extends Musuh{

    public Zombie(String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
        System.out.println(getClass().getSimpleName() + " diinisialisasi.");
    }
    
    void Menggigit() {
        System.out.println(getClass().getSimpleName() +
                " bisa menggigit. HP " + getClass().getSimpleName() + 
                " adalah: " + hp);
    }
    
    void Jalan() {
        System.out.println(getClass().getSimpleName() +
                " bisa jalan-jalan. Nama " + getClass().getSimpleName() + 
                " adalah: " + name);
    }
    
}
