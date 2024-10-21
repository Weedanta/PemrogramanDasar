/**
 * Looping
 */
public class Looping {

    public static void main(String[] args) {

        // For
        // for (int i = 1; i <= 5; i++) {
        // System.out.println("Angka: " + i);
        // }

        // While
        // int i = 1;
        // while (i >= 5) {
        // System.out.println("Angka: " + i);
        // i++;
        // }

        // Do-While
        // int i = 1;
        // do {
        // System.out.println("Angka: " + i);
        // i++;
        // } while (i <= 5);

        // Nested loop
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Break
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println("Angka: " + i);
        // }

        // Continue
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println("Angka: " + i);
        // }

        // Contoh

        // int n = 5;
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }
        // System.out.println("Jumlah: " + sum);

        // int n = 5;
        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.println("Jumlah: " + sum);

        // int n = 5;
        // int sum = 0;
        // int i = 1;
        // do {
        // sum += i;
        // i++;
        // } while (i <= n);
        // System.out.println("Jumlah: " + sum);

        // Contoh expert
        String kalimat = "suatuhariakudiperintahkanuntukmembuatkodeloopingyangsusahdanakumenjalankannyadenganbaikdansangatcepatsehinggaselesidenganbenar";
        char[] huruf = new char[kalimat.length()];
        System.out.println(huruf[0]);
        for (int i = 0; i < huruf.length; i++) {
            huruf[i] = ' ';
        }

        for (int i = kalimat.length()-1; i >= 0; i--) {
            for (char c = 'a'; c <= kalimat.charAt(i); c++) {
                huruf[i] = c;
                for (int j = 0; j < kalimat.length(); j++) {
                    System.out.print(huruf[j]);
                }
                System.out.println();
            }
        }

    }
}