package tugaspertemuan6;

/**
 *
 * @author Syafiq
 */
public class Huruf {
    public static void main(String[] args) {
        
        System.out.println("Program deret huruf Z sampai A:");
        char huruf = 'Z';
        // disini kita gunakan do-while
        do {
            System.out.print(huruf + " ");
            huruf--;
        } while (huruf >= 'A');

        System.out.println();
    }
}
