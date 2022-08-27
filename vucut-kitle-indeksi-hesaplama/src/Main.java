import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, indeks;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinde giriniz: ");
        boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();

        indeks = (kilo / (boy * boy));

        // double normal = 22*(boy-0.10)*(boy-0.10); ideal kilo hesaplamak için

        if (indeks < 18.5) {
            System.out.println("Vücut kitle indeksiniz: " + indeks);
            System.out.println("Kilo kategorisi: Zayıf");

        } else if (indeks >= 18.5 && indeks <= 24.9) {
            System.out.println("Vücut kitle indeksiniz: " + indeks);
            System.out.println("Kilo kategorisi: Normal");
        } else if (indeks >= 25 && indeks <= 29.9) {
            System.out.println("Vücut kitle indeksiniz: " + indeks);
            System.out.println("Kilo kategorisi: Fazla Kilolu");
        } else if (indeks >= 30 && indeks <= 34.9) {
            System.out.println("Vücut kitle indeksiniz: " + indeks);
            System.out.println("Kilo kategorisi: 1. Derece Obezite");
        } else if (indeks >= 35 && indeks <= 40) {
            System.out.println("Vücut kitle indeksiniz: " + indeks);
            System.out.println("Kilo kategorisi: 2. Derece Obezite");
        } else if (indeks> 40) {
            System.out.println("Vücut kitle indeksiniz: " + indeks);
            System.out.println("Kilo kategorisi: 3. Derece Obezite");


        }
    }
}
