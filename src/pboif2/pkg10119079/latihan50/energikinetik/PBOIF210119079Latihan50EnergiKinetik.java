package pboif2.pkg10119079.latihan50.energikinetik;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan50EnergiKinetik {
    public static void main(String[] args) {        
        Bola bola = new Bola();
        
        bola.setMassa(145);
        bola.setKecepatan(25);
        
        System.out.println("Massa  : " + bola.getMassa() +" gram");
        System.out.println("Kecepatan : " + bola.getKecepatan()+" m/s");
        bola.HitungEnergiKinetik(bola.getMassa(), bola.getKecepatan());
        bola.usaha(bola.getMassa(), bola.getKecepatan());
    }
    
}
