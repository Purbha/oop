package lat_enum;
/* @author Irsyad */
public class LatEnum6 {
    
    static void Garis() {
            System.out.println("===============================");
    }
    
    public static void main(String[] args) {
        System.out.println("Test Enum Drone");
        Garis();
        Drone drone = new Drone(0, Drone.merk.DJI, false, 0);
        Garis();
        drone.terbang();
        Garis();
        drone.maju();
        Garis();
        drone.nyalakanMesin();
        Garis();
        drone.maju();
        Garis();
        drone.mundur();
        Garis();
        drone.terbang();
        Garis();
        drone.isiEnergi();
        Garis();
        
        drone.matikanMesin();
        Garis();
        drone.isiEnergi();
        Garis();
        drone.maju();
        Garis();
        drone.nyalakanMesin();
        Garis();
        drone.terbang();
        Garis();
        drone.maju();
        Garis();
        drone.terbang();
        Garis();
        drone.mundur();
        Garis();
        drone.belok();
        Garis();
        drone.matikanMesin();
        Garis();
        drone.turun();
    }
    
}
