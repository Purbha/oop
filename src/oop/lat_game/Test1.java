package oop.lat_game;
/* @author Irsyad */
public class Test1 {
    
    public static void main(String[] args) {
        Zombie zombie = new Zombie("Joong-ki",120,35);
        zombie.attack();
        zombie.Jalan();
        zombie.Menggigit();
        zombie.garis();
        Monster monster = new Monster("Jisoo", 95, 65);
        monster.attack();
        monster.Lompat();
        monster.Memukul();
        monster.garis();
        Burung burung = new Burung("Jennie", 80, 75);
        burung.attack();
        burung.Lompat();
        burung.Terbang();
        burung.Jalan();
        burung.garis();
    }
    
}
