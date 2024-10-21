import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        double d = scanner.nextDouble();
        int tanda = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='.') {
                tanda = i;
            }
        }

        String akhiran = a.substring(tanda);

        System.out.println("Nama email baru: "+ b + "@" + c + akhiran);
        System.out.println("Nama domain untuk Elon: " + c + akhiran);
        if (akhiran.equals(".com")) {
            d = 1.5 * d;
        } else if (akhiran.equals(".id")) {
            d = 1.75 * d;
        } else if (akhiran.equals(".net")){
            d = 1.25 * d;
        } System.out.printf("Total harga pembelian: %.2f$", d );
    }
}