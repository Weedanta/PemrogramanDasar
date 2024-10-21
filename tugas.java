import java.util.*;

class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Kuda1 = sc.nextInt();
        int Kuda2 = sc.nextInt();
        int Kuda3 = sc.nextInt();

        int KudaTercepat1;
        int KudaTercepat2;
        int KudaTercepat3;

        if (Kuda1 > Kuda2) {
            KudaTercepat1 = Kuda1;
            if (Kuda2 > Kuda3) {
                KudaTercepat2 = Kuda2;
                KudaTercepat3 = Kuda3;
            } else {
                KudaTercepat2 = Kuda3;
                KudaTercepat3 = Kuda2;
            }
        } else if (Kuda2 > Kuda1) {
            KudaTercepat1 = Kuda2;
            if (Kuda1 > Kuda3) {
                KudaTercepat2 = Kuda1;
                KudaTercepat3 = Kuda3;
            } else {
                KudaTercepat2 = Kuda3;
                KudaTercepat3 = Kuda1;
            }
        }

        
        if (Kuda1 > Kuda3) {
            KudaTercepat1 = Kuda1;
            if (Kuda1 > Kuda2) {
                KudaTercepat2 = Kuda1;
                KudaTercepat3 = Kuda2;
            } else {
                KudaTercepat2 = Kuda2;
                KudaTercepat3 = Kuda1;
            }
        } else if (Kuda3 > Kuda1) {
            KudaTercepat1 = Kuda3;
            if (Kuda1 > Kuda2) {
                KudaTercepat2 = Kuda1;
                KudaTercepat3 = Kuda2;
            } else {
                KudaTercepat2 = Kuda2;
                KudaTercepat3 = Kuda1;
            }
        }
    }
}