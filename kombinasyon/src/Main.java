
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n= ");
        int n = scan.nextInt();
        int total = 1;
        int total2=1;
        int total3=1;
        System.out.print("r= ");
        int r = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        for (int j = 1; j <= r; j++) {
            total2 *= j;
        }
        for(int k=1;k<=(n-r);k++){
            total3*=k;

        }
        double faktor=total/(total2*total3);
        System.out.println("C(n,r)= "+faktor);
    }
}