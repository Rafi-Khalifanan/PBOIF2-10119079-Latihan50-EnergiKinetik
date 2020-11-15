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
public class Bola {
    private double massa,kecepatan;
    
    public double getMassa(){
        return massa;
    }
    
    public void setMassa(double massa){
        this.massa=massa;
    }
    
    public double getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(double kecepatan){
        this.kecepatan=kecepatan;
    }
    
    public double HitungEnergiKinetik(double massa, double kecepatan){
        double eKinetik;
        
        eKinetik = ((massa / 2)/1000) * (Math.pow(kecepatan, 2));
        System.out.println("Energi Kinetik : " + eKinetik + " Joule");
        return eKinetik;
    }
    
    public double usaha(double massa, double kecepatan){
        double usaha;
        
        usaha = (((massa / 2)/1000) * (Math.pow(kecepatan, 2))) - (((massa/2)/1000) * 0 * 0);
        System.out.println("Usaha dari keadaaan diam : " + usaha + " Joule");
        return usaha;
    }
}
