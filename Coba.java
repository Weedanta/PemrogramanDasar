import java.util.Scanner;
public class ratarata{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double mat , bhs, ipa, avg;
        
        mat = input.nextDouble();
        bhs = input.nextDouble();
        ipa = input.nextDouble();

        double avg = (mat + bhs + ipa) / 3;
        System.out.println("Rata-rata nilai: " + avg);

        if (rata2 >=70){ System.out.println("Status: Lulus");}
            else{System.out.println("Status: Tidak Lulus");}
        
        if (rata2 >= 85){System.out.println("Predikat: Sangat Baik");}
            else if (rata2>=70 && rata2<85){System.out.println("Predikat: Baik");}
    }
}