package TugasPraktikum6;
import java.util.Scanner;
/**
 *
 * @author Syafiq
 */
public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program tabel perkalian");

        System.out.print("Masukkan nilai n (n <= 10): ");
        int n = input.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Input tidak valid");
            return;
        }

        System.out.println("Tabel perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        input.close();
    }
    
}