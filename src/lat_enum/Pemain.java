package lat_enum;
/* @author Irsyad */
public class Pemain {
    
    private String nama;
    public enum Kecepatan {
        LAMBAT,
        SEDANG,
        KENCANG
    }
    private int healthPoin;
    private Kecepatan kcp;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHealthPoin(int healthPoin) {
        this.healthPoin = healthPoin;
    }

    public void setKcp(Kecepatan kcp) {
        this.kcp = kcp;
    }
    
    boolean isDead(){
        //The if statement is redundant
        //Menyarankan ekspresi yang lebih singkat dengan hasil yang sama
        //if(healthPoin <= 0) { return true; } else { return false; }
        return healthPoin <= 0;
    }
    
    void run(){
        System.out.println(nama + " sedang berlari..");
        System.out.println("Berlari dengan kecepatan: " + kcp);
    }
    
}
