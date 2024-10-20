package pertemuan7;

import java.util.Scanner;

/**
 *
 * @author Syafiq
 */
public class Toko {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kodeBarang = {"a1", "b2", "c3", "d4", "e5"};
        String[] namaBarang = {"Baju", "Celana", "Kemeja", "Rok", "Sepatu"};
        int[] hargaBarang = {35000, 25000, 40000, 25000, 50000};

        String[] kodeTransaksi = new String[100];
        String[] namaTransaksi = new String[100];
        int[] Harga = new int[100];
        int[] JumlahBeli = new int[100];
        int[] TotalHarga = new int[100];

        System.out.println("TOKO SERBA ADA");
        System.out.println("****************");
        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();
        
        int transaksiIndex = 0;
        int totalHargaSemua = 0;

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            String kode = input.next();
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = input.nextInt();
            
            boolean barangDitemukan = false;

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equals(kode)) {
                    int totalHarga = hargaBarang[j] * jumlahBeli;
                    totalHargaSemua += totalHarga;

                    kodeTransaksi[transaksiIndex] = kodeBarang[j];
                    namaTransaksi[transaksiIndex] = namaBarang[j];
                    Harga[transaksiIndex] = hargaBarang[j];
                    JumlahBeli[transaksiIndex] = jumlahBeli;
                    TotalHarga[transaksiIndex] = totalHarga;

                    transaksiIndex++;
                    barangDitemukan = true;
                    break;
                }
            }

            if (!barangDitemukan) {
                System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
            }
        }

        
        System.out.println("\n\nTOKO SERBA ADA");
        System.out.println("****************");
        System.out.printf("%-5s %-15s %-15s %-10s %-15s %-15s\n", 
                          "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Total Bayar");
        System.out.println("=============================================================================");

        for (int i = 0; i < transaksiIndex; i++) {
            System.out.printf("%-8d %-14s %-13s %-15d %-13d %-20d\n", 
                              (i + 1), kodeTransaksi[i], namaTransaksi[i], Harga[i], JumlahBeli[i], TotalHarga[i]);
        }
        System.out.println("=============================================================================");
        System.out.printf("%-67s %-20d\n", "Total Semua", totalHargaSemua);
        System.out.println("=============================================================================");

        input.close();
    }
}
