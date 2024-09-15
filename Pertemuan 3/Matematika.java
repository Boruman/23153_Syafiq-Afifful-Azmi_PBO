package Pertemuan3.Latihan1;

/**
 *
 * @author Syafiq
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 hitung = new Matematika2();
        
        System.out.println("Hasil Hitung");
        System.out.println("a = 20");
        System.out.println(" b = 15");

        int hasiltambah = hitung.tambah(20, 15);
        int hasilkurang = hitung.kurang(20, 15);
        int hasilkali = hitung.kali(20, 15);
        int hasilbagi = hitung.bagi(20, 15);
        int hasilmodulus = hitung.modulus(20, 15);
        System.out.println(" Hasil Pertambahan : " + hasiltambah);
        System.out.println(" Hasil Pengurangan : " + hasilkurang);
        System.out.println(" Hasil Perkalian : " + hasilkali);       
        System.out.println(" Hasil Pembagian : " + hasilbagi);       
        System.out.println(" Hasil Modulus : " + hasilmodulus);
    }
}
