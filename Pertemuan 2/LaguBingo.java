package Pertemuan2.Latihan3;

/**
 *
 * @author Syafiq
 */

class LaguBingo {
    // Konstruktor BingoSong
    public LaguBingo() {
        // Memanggil method untuk menampilkan lagu
        printSong();
    }

    // Method untuk mencetak lagu Bingo
    public void printSong() {
        String[] bingo = {"B", "I", "N", "G", "O"};
        int clapCount = 0;

        for (int i = 0; i <= bingo.length; i++) {
            // Menampilkan bagian awal lirik
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

            // Menampilkan huruf B-I-N-G-O atau (clap)
            for (int j = 0; j < bingo.length; j++) {
                if (j < clapCount) {
                    System.out.print("(clap)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j != bingo.length - 1) {
                    System.out.print("-");
                }
            }

            System.out.println(); // Ganti baris setelah menampilkan B-I-N-G-O atau (clap)

            // Ulangi baris dengan huruf atau clap
            for (int j = 0; j < bingo.length; j++) {
                if (j < clapCount) {
                    System.out.print("(clap)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j != bingo.length - 1) {
                    System.out.print("-");
                }
            }
            
            System.out.println(); // Ganti baris

            for (int j = 0; j < bingo.length; j++) {
                if (j < clapCount) {
                    System.out.print("(clap)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j != bingo.length - 1) {
                    System.out.print("-");
                }
            }

            
            System.out.println(); // Ganti baris

            // Menampilkan bagian akhir lirik
            System.out.println("And Bingo was his name-o.\n");

            // Menambah jumlah (clap) setiap iterasi
            clapCount++;
        }
    }
}
