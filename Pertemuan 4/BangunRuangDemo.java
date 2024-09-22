package pertemuan4;

/**
 *
 * @author Syafiq Afifful Azmi
 */
public class BangunRuangDemo {
    public static void main(String[] args) {
        BangunRuang bangun1 = new BangunRuang(8);
        BangunRuang bangun2 = new BangunRuang(2, 4, 6);
        
        System.out.println("Menghitung volume dan luas kubus: ");
        System.out.println("Luas Kubus: " + bangun1.luasKubus());
        System.out.println("Volume Kubus: " + bangun1.volumeKubus());
        System.out.println("");
        System.out.println("Menghitung volume dan luas Balok: ");
        System.out.println("Luas Balok: " + bangun2.luasBalok());
        System.out.println("Volume Balok: " + bangun2.volumeBalok());
    }
    
}
