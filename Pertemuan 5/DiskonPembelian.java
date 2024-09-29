package tugas5;

/**
 *
 * @author Syafiq Afifful Azmi
 */
import java.util.Scanner;

public class DiskonPembelian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Total Pembelian Rp. = ");
        double jumlahPembelian = scanner.nextDouble();

        double potongan = 0.0;
        
        
        if (jumlahPembelian < 50000) {
            potongan = 0.05 * jumlahPembelian; 
        } else {
            potongan = 0.20 * jumlahPembelian; 
        }

        
        double jumlahBayar = jumlahPembelian - potongan;

        
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahBayar);
    }
}
