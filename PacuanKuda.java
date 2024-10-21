
import java.util.Scanner;
public class PacuanKuda {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String k1,k2,k3;
        int d1,d2,d3;
        double s1,s2,s3;

        k1 = sc.nextLine();
        d1 = sc.nextInt();
        sc.nextLine();

        k2 = sc.nextLine();
        d2 = sc.nextInt();
        sc.nextLine();

        k3 = sc.nextLine();
        d3 = sc.nextInt();

        s1 = 2.4/d1*3600;
        s2 = 2.4/d2*3600;
        s3 = 2.4/d3*3600;
sc.close();


        if (s1>s2 && s1>s3 && s2 > s3) {
            System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam\n",k1,s1);
            System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam\n",k2,s2);
            System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam\n",k3,s3);

        } else if (s2>s1 && s2>s3 && s1 > s3){
            System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam\n",k2,s2);
            System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam\n",k1,s1);
            System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam\n",k3,s3);

        }   else if (s1>s2 && s1>s3 && s3 > s2) {
            System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam\n",k1,s1);
            System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam\n",k3,s3);
            System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam\n",k2,s2);

        }else if (s2>s1 && s2>s3 && s3 > s1){
            System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam\n",k2,s2);
            System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam\n",k1,s1);
            System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam\n",k3,s3);

        }else if (s3>s1 && s3>s2 && s2 > s1){
            System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam\n",k3,s3);
            System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam\n",k2,s2);
            System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam\n",k1,s1);

        }else if (s3>s1 && s3>s2 && s1 > s2){
            System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam\n",k3,s3);
            System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam\n",k1,s1);
            System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam\n",k2,s2);

        }

    }
}
