import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;


        System.out.println("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1: Toplama\n 2: Çıkarma\n 3: Çarpma\n 4: Bölme\n Seçiniz:");

        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplam: " + n1 + n2);
                break;
            case 2:
                System.out.println("Fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez.");
                    default:
                        System.out.println("Bölüm: " + (n1 / n2));
                        break;
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Lütfen programı yeniden çalıştırıp tekrar deneyin.");


        }
        input.close();
    }

}

