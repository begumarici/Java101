import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double birinciKenar, ikinciKenar, ucuncuKenar, cevre, alan, u;
        Scanner input = new Scanner(System.in);

        System.out.println("Ucgenin birinci kenar uzunluğunu giriniz: ");
        birinciKenar = input.nextDouble();
        System.out.println("Ucgenin ikinci kenar uzunlugunu giriniz: ");
        ikinciKenar = input.nextDouble();
        System.out.println("Ucgenin ucuncu kenar uzunlugunu giriniz: ");
        ucuncuKenar = input.nextDouble();

        cevre = (birinciKenar+ikinciKenar+ucuncuKenar);
        u = cevre/2;

        alan = Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));
        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);



    }
}
