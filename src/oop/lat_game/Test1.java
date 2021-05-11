package oop.lat_game;

import java.util.Scanner;

/* @author Irsyad */
public class Test1 {
    
    void Garis(int jml) {
        for(int i=0;i<jml;i++) {
            System.out.print("=");        
        }
        System.out.print("\n");
    }
    
    void Tampil(int Pilih) {
        switch (Pilih) {
            case 1:
                Zombie zombie = new Zombie("Joong-ki",120,35);
                zombie.attack();
                zombie.Jalan();
                zombie.Menggigit();
                zombie.garis();                
                break;
            case 2:
                Monster monster = new Monster("Jisoo", 95, 65);
                monster.attack();
                monster.Lompat();
                monster.Memukul();
                monster.garis();
                break;
            default:
                Burung burung = new Burung("Jennie", 80, 75);
                burung.attack();
                burung.Lompat();
                burung.Terbang();
                burung.Jalan();
                burung.garis();
                break;
        }        
    }
    
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println("Program OOP");
        test1.Garis(30);
        System.out.println("Pilihan Musuh");
        System.out.println("1. Zombie Joong-ki");
        System.out.println("2. Monster Jisoo");
        System.out.println("3. Burung Jennie");
        test1.Garis(30);
        System.out.print("Pilih Musuh [1/2/3]: ");
        Scanner scanner = new Scanner(System.in);
        int pilih = scanner.nextInt();
        test1.Tampil(pilih);
    }
    
}
