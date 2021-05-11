package inter_face;
/* @author Irsyad */
public class Persegi implements InterfaceKell, InterfaceLuas{

    private int panjang = 0;
    private int lebar = 0;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public float Kell() {
        return (2 * panjang) + (2 * lebar); 
    }

    @Override
    public float Luas() {
        return panjang * lebar;
    }
    
}
