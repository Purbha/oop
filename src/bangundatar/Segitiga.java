package bangundatar;
/* @author Irsyad */
public class Segitiga extends BangunDatar{
    int alas;
    int tinggi;
    
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float Luas() {
        /* 
        Penulisan '0.5' saja adalah masuk ke tipe double
        Untuk float kita harus menambahkan 'f'
        https://docs.oracle.com/javase/specs/jls/se10/html/jls-3.html#jls-3.10.2
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        */
        return this.alas * this.tinggi * 0.5f;
    }
}
