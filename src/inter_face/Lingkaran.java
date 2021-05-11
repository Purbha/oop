package inter_face;
/* @author Irsyad */
public class Lingkaran implements InterfaceKell, InterfaceLuas{

    private int jari = 0;

    public void setJari(int jari) {
        this.jari = jari;
    }

    @Override
    public float Kell() {
        return (float) (2 * Math.PI * jari);
    }

    @Override
    public float Luas() {
        return (float) (Math.PI * jari * jari);
    }
    
}
