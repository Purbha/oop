package lat_enum;
/* @author Irsyad */
public class Drone extends Pesawat{

    enum merk {
        DJI,
        BRICA,
        JJRC
    }
    
    private final merk namaMerk;

    Drone(int energi, merk namaMerk, boolean mesinStatus, int ketinggian) {
        this.energi = energi;
        this.namaMerk = namaMerk;
        this.mesinStatus = mesinStatus;
        this.ketinggian = ketinggian;
        System.out.println("Drone diinisialisasi." +
                "\nMerk: " + namaMerk + "\nEnergi: " + energi +
                "\nMesin Status: " + mesinStatus + "\nKetinggian: " +
                ketinggian);
    }
    
    boolean cekMesin() {
        if(mesinStatus == true) {
            return true;
        } else {
            System.out.println("Mesin belum dinyalakan.");
            return false;
        }
    }
    
    boolean cekKetinggian() {
        if(ketinggian <= 0) {
            System.out.println("Drone berada di tanah.");
            return false;            
        } else {
            return true;
        }
    }
    
    boolean cekEnergi() {
        if(energi <= 0) {
            System.out.println("Drone kehabisan energi.");
            if(ketinggian > 0) {
                System.out.println("Drone jatuh.");                
            }
            return false;            
        } else {
            return true;
        }
    }
    
    void cekStatus() {
        System.out.println("Ketinggian: " + ketinggian);
        System.out.println("Energi: " + energi);
    }
    
    void nyalakanMesin() {
        if(mesinStatus == true){
            System.out.println("Mesin sudah menyala.");
        } else {
            mesinStatus = true;
            System.out.println("Mesin dinyalakan.");
        }
    }
    
    void matikanMesin(){
        System.out.println("Perintah Matikan Mesin!");
        if(cekKetinggian() == true) {
            System.out.println("Mesin tidak bisa dimatikan karena drone"
                    + " sedang terbang");
            return;            
        }
        mesinStatus = false;
        System.out.println("Mesin dimatikan.");
    }

    void isiEnergi() {
        System.out.println("Perintah Isi Energi!");
        if(mesinStatus == true) {
            System.out.println("Tidak bisa isi energi " +
                    "karena mesin drone sedang menyala.");
            return;
        }
        if(ketinggian > 0) {
            System.out.println("Tidak bisa isi energi " +
                    "karena drone sedang terbang.");
            return;            
        }
        energi = 50;
        System.out.println("Energi drone diisi sebanyak: " + energi);
    }

    void terbang(){
        System.out.println("Perintah Terbang!");
        if(cekMesin() == false) {
            System.out.println("Drone tidak bisa terbang.");
            return;
        }
        if(cekEnergi() == false) {
            System.out.println("Drone tidak bisa terbang.");
            return;
        }
        energi--;
        ketinggian++;
        System.out.println("Drone Terbang.");
        cekStatus();
    }
        
    void turun(){
        System.out.println("Perintah Turun!");
        if(cekMesin() == false) {
            System.out.println("Drone tidak bisa turun.");
            return;
        }
        if(cekKetinggian() == false) {
            System.out.println("Drone tidak bisa turun.");
            return;            
        }
        if(cekEnergi() == false) {
            System.out.println("Drone tidak bisa turun.");
            return;
        }
        ketinggian--; energi--;
        System.out.println("Drone Turun.");
        cekStatus();
    }

    void belok(){
        System.out.println("Perintah Belok!");
        if(cekMesin() == false) {
            System.out.println("Drone tidak bisa belok.");
            return;
        }
        if(cekKetinggian() == false) {
            System.out.println("Drone tidak bisa belok.");
            return;            
        }
        if(cekEnergi() == false) {
            System.out.println("Drone tidak bisa terbang.");
            return;
        }
        energi--;
        System.out.println("Drone Belok.");
        cekStatus();
    }

    void maju(){
        System.out.println("Perintah Maju!");
        if(cekMesin() == false) {
            System.out.println("Drone tidak bisa maju.");
            return;
        }
        if(cekKetinggian() == false) {
            System.out.println("Drone tidak bisa maju.");
            return;            
        }
        if(cekEnergi() == false) {
            System.out.println("Drone tidak bisa terbang.");
            return;
        }
        energi--;
        System.out.println("Drone Maju.");
        cekStatus();
    }

    void mundur(){
        System.out.println("Perintah Mundur!");
        if(cekMesin() == false) {
            System.out.println("Drone tidak bisa mundur.");
            return;
        }
        if(cekKetinggian() == false) {
            System.out.println("Drone tidak bisa mundur.");
            return;            
        }
        if(cekEnergi() == false) {
            System.out.println("Drone tidak bisa terbang.");
            return;
        }
        energi--;
        System.out.println("Drone Mundur.");
        cekStatus();
    }
    
}
