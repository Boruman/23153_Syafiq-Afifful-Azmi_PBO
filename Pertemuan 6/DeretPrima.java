package tugaspertemuan6;

/**
 *
 * @author Syafiq
 */
public class DeretPrima {
    public static void main(String[] args) {
        System.out.println("Program Deret Bilangan Prima:");
        for (int i = 0; i <= 20; i++) {
            if (Prima(i)) {
                System.out.println(i + " adalah bilangan PRIMA");
            } else {
                System.out.println(i + " bukanlah bilangan prima");
            }
        }
    }

    public static boolean Prima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) 
        return false;
        }
        return true;
    }
}    
