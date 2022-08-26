import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvTutari, total;

        Scanner input = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        if (0 < tutar && tutar < 1000) {
            kdvTutari = tutar*0.18;
            total = tutar + kdvTutari;

            System.out.println("KDV'siz tutar: " + tutar);
            System.out.println("KDV oranı: %18");
            System.out.println("KDV tutarı: " + kdvTutari);
            System.out.println("KDV'li fiyat: " + total);


        } else if (tutar >= 1000) {
            kdvTutari = tutar*0.08;
            total = tutar + kdvTutari;
            System.out.println("KDV'siz tutar: " + tutar);
            System.out.println("KDV oranı: %8");
            System.out.println("KDV tutarı: " + kdvTutari);
            System.out.println("KDV'li fiyat: " + total);

        }
    }
}
