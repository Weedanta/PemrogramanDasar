import java.io.*;
import java.util.*;
import java.lang.Math;

public class Bola {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double sudut = Math.toRadians(input.nextDouble());
    int kecepatan = input.nextInt();
    int waktu = 6;

    // jarak horizontal bola terhadap gedung

    double kecepatanPerDetik = (kecepatan * 5 / 18) * waktu;
    int jarak = (int) Math.ceil(50 * Math.tan(sudut));

    // true false
    boolean keberhasilan = jarak < kecepatanPerDetik + 5;

    // output
    System.out.println("Jarak horizontal bola terhadap gedung: " + jarak + " meter");
    System.out.println("Peserta dapat menangkap bola: " + keberhasilan);
  }
}