import java.util.Scanner;

public class FestivalMakananAneh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Suhu, Jam kedatangan, Durasi festival
        int suhu = scanner.nextInt();
        int jamKedatangan = scanner.nextInt();
        int durasiFestival = scanner.nextInt();

        String makanan = "Makanan Cadangan"; // Default jika tidak memenuhi kondisi
        boolean bonus = false; // Untuk memeriksa apakah mendapat bonus makanan

        // Cek apakah durasi festival lebih dari 12 jam
        if (durasiFestival > 12) {
            bonus = true;
        }

        // Logika seleksi kondisi
        if (suhu < 0 && jamKedatangan >= 6 && jamKedatangan <= 10) {
            makanan = "Es Krim Super Beku";
        } else if (suhu >= 0 && suhu <= 100 && jamKedatangan >= 11 && jamKedatangan <= 17) {
            makanan = "Nasi Goreng Alien";
        } else if (suhu > 100 && jamKedatangan >= 18 && jamKedatangan <= 23) {
            makanan = "Sup Lava Panas";
        }

        // Tambahkan "Bonus Makanan" jika durasi lebih dari 12 jam
        if (bonus) {    
            makanan += " + Bonus Makanan";
        }

        // Output makanan yang diperoleh
        System.out.println(makanan);
    }
}
