import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, t, aTemp, bTemp, ekok, ebob;
        Scanner input = new Scanner(System.in);


        System.out.println("2 sayı giriniz: ");
        a = input.nextInt();
        b = input.nextInt();

        aTemp = a;
        bTemp = b;

        while (bTemp != 0) {
            t = bTemp;
            bTemp = aTemp % bTemp;
            aTemp = t;
        }

        ebob = aTemp;

        /*
         * ebob(a, b) * ekok(a, b) = a*b
         */
        ekok = (a * b) / ebob;
        System.out.println("EKOK = " + ekok);
        System.out.println("EBOB = " + ebob);
    }
}
