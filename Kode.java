import java.util.*;

public class Kode {

    public static void main(String[] args) {
        Scanner wedantaInput = new Scanner(System.in);
        int kendaraanApa = wedantaInput.nextInt();
        int waktuParkir = wedantaInput.nextInt();
        int uang = wedantaInput.nextInt();
        int uangParkir = 0;
        
        //kendaraannya apa?
        switch (kendaraanApa) {
            case 1: 
                // Motor
                uangParkir = 2000 * waktuParkir;
                break;
            case 2: 
                // Mobil
                uangParkir = 4000 * waktuParkir;
                break;
            case 3: 
                // Bus
                uangParkir = 9000 * waktuParkir;
                break;
            default:
        }

        // Uang cukup belum?
        if (uang > uangParkir) {
            // kembalian
            int uangKembalian = uang - uangParkir;
            int uang10k = uangKembalian / 10000;
            uangKembalian %= 10000;
            int uang5k = uangKembalian / 5000;
            uangKembalian %= 5000;
            int uang500 = uangKembalian / 500;
            uangKembalian %= 500;
            int uang100 = uangKembalian / 100;
            System.out.println("Anda mendapatkan kembalian sebesar:");
            System.out.println(uang10k + " uang 10.000");
            System.out.println(uang5k + " uang 5.000");
            System.out.println(uang500 + " uang 500");
            System.out.println(uang100 + " uang 100");
        } else if (uang < uangParkir) {
            System.out.println("Uang anda belum mencukupi.");
        } else {
            System.out.println("Uang yang dibayarkan pas.");
        }
    }
}