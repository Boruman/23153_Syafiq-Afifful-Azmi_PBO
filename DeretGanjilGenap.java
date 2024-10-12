package tugaspertemuan6;

/**
 *
 * @author Syafiq
 */
public class DeretGanjilGenap {
    public static void main(String[] args) {
        System.out.println("Program untuk menentukan bilangan Genap & Ganjil :");
        int i = 0; while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        }
    }
}
