import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r, a, alan, pi = 3.14;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz: ");
        r = scan.nextDouble();
        System.out.println("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = scan.nextDouble();

        alan = (pi*(r*r)*a)/360;

        System.out.println("Daire diliminin alanı: " + alan);

    }
}
