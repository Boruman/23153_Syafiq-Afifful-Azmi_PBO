package Tugas5;

import java.util.Scanner;

public class PenghitungIMT {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
        	System.out.println("===========Calculator IMT===========");
            System.out.print("Masukkan Berat Badan (kg): ");
            double beratBadan = scanner.nextDouble();

            System.out.print("Masukkan Tinggi Badan (cm): "); 
            double tinggiBadanCm = scanner.nextDouble();

            double tinggiBadanM = konversiCmKeM(tinggiBadanCm);

            if (tinggiBadanM == 0) {
                System.out.println("Tinggi badan tidak dapat sama dengan nol.");
                return;
            }
            double imt = hitungImt(beratBadan, tinggiBadanM);
            String kriteriaKegemukan = tentukanKriteriaKegemukan(imt);

            System.out.printf("IMT: %.2f%n", imt);
            System.out.println(kriteriaKegemukan);
        }
    }

    public static double konversiCmKeM(double tinggiBadanCm) {
        return tinggiBadanCm / 100; 
    }
  
    public static double hitungImt(double beratBadan, double tinggiBadan) {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }
  
    public static String tentukanKriteriaKegemukan(double imt) {
        if (imt < 18.4) {
            return "Kategori Berat Badan : Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Kategori Berat Badan : Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Kategori Berat Badan : Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Kategori Berat Badan : Gemuk";
        } else {
            return "Kategori Berat Badan : Sangat Gemuk";
        }
    }
}
