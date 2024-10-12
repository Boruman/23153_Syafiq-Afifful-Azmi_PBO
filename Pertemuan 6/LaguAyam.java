package tugaspertemuan6;

/**
 *
 * @author Acer
 */
public class LaguAyam {
    public static void main(String[] args) {
        LaguAyam laguayam = new LaguAyam();
        laguayam.berkotek();
    }
    public void berkotek() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Tekotek kotek kotek anak ayam turun berkotek");
        }

        for (int n = 6; n >= 2; n--) {
            System.out.println("Anak ayam turunlah " + n + ", mati satu tinggalah " + (n - 1));

            if (n >= 4) {
                for (int i = 0; i < 2; i++) {
                    System.out.println("Tekotek kotek kotek anak ayam turun berkotek");
                }
            }
        }
        System.out.println("Anak ayam turunlah 1, mati satu tinggal induknya");
        System.out.println("Tekotek kotek kotek induk ayam cari anaknya");
        System.out.println("Tekotek kotek kotek akhirnya ketemu semua");
    }

}
