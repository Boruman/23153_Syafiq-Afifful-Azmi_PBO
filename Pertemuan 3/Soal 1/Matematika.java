package Pertemuan3.Latihan1;

/**
 *
 * @author Syafiq
 */
public class Matematika {
    
    public int tambah(int a, int b){
      return a+b; 
    }
    public int kurang(int a, int b){
        return a-b;
    }
    public int kali(int a, int b){
        return a*b; 
    }
    public int bagi(int a,int b){
        if (b != 0){
             return a/b;
    }
    System.out.println("Pembagi tidak boleh sama dengan 0");
        return 0;
    }
}
