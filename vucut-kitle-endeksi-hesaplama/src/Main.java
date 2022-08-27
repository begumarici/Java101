import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, endeks;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinde giriniz: ");
        boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();

        endeks = (kilo / (boy * boy));

        // double normal = 22*(boy-0.10)*(boy-0.10); ideal kilo hesaplamak için

        if (endeks < 18.5) {
            System.out.println("Vücut kitle endeksiniz: " + endeks);
            System.out.println("Kilo kategorisi: Zayıf");

        } else if (endeks >= 18.5 && endeks <= 24.9) {
            System.out.println("Vücut kitle endeksiniz: " + endeks);
            System.out.println("Kilo kategorisi: Normal");
        } else if (endeks >= 25 && endeks <= 29.9) {
            System.out.println("Vücut kitle endeksiniz: " + endeks);
            System.out.println("Kilo kategorisi: Fazla Kilolu");
        } else if (endeks >= 30 && endeks <= 34.9) {
            System.out.println("Vücut kitle endeksiniz: " + endeks);
            System.out.println("Kilo kategorisi: 1. Derece Obezite");
        } else if (endeks >= 35 && endeks <= 40) {
            System.out.println("Vücut kitle endeksiniz: " + endeks);
            System.out.println("Kilo kategorisi: 2. Derece Obezite");
        } else if (endeks > 40) {
            System.out.println("Vücut kitle endeksiniz: " + endeks);
            System.out.println("Kilo kategorisi: 3. Derece Obezite");


        }
    }
}
