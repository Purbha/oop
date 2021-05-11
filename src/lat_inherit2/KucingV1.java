package lat_inherit2;
/*@author Irsyad*/
public class KucingV1 extends KarnivoraV1{
    
    public void Suara() {
        System.out.println("Ini adalah " + getClass().getSimpleName());
        System.out.println("Suara " +  getClass().getSimpleName() +  
                " adalah meong.");
    }

}
