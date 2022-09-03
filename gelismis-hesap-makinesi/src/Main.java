import java.util.Scanner;

public class Main {

    static void plus(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int counter = input.nextInt();
        int number, result = 0;

        if (counter >1) {
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
        } else {
            System.out.println("En az 2 adet sayı girmelisiniz.");
        }
    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int counter = input.nextInt();
        int number, result = 0;

        if (counter >1) {
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
        } else {
            System.out.println("En az 2 adet sayı girmelisiniz.");
        }
    }

    static void multiply() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int counter = input.nextInt();
        int number, result = 0;

        if (counter >1) {
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = input.nextInt();
                if (i == 1) {
                    result += number;
                    continue;
                }
                result *= number;
            }

            System.out.println("Sonuç : " + result);

        } else {
            System.out.println("En az 2 adet sayı girmelisiniz.");
        }
    }

    static void  divide(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int counter = input.nextInt();
        double number, result = 0;

        if (counter > 1) {
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = input.nextInt();
                if (i == 1) {
                    result = number;
                    continue;
                }
                result /= number;
            }

            System.out.println("Sonuç : " + result);

        } else {
            System.out.println("En az 2 adet sayı girmelisiniz.");
        }
    }

    static void power (){
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        int a = input.nextInt();
        System.out.println("Üs değerini giriniz: ");
        int b= input.nextInt();

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = input.nextInt();

        if (b != 0) {
            int result = a % b;
            System.out.println("Sonuç : " + result);
        } else {
            System.out.println("Tanımsız.");
        }
    }

    static void rec() {
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin 1. kenarını giriniz: ");
        int a = input.nextInt();
        System.out.println("Dikdörtgenin 2. kenarını giriniz: ");
        int b = input.nextInt();

        if ( a != 0 && b != 0) {
            int area = a * b;
            System.out.println("Dikdörtgenin alanı: " + area);
            int cevre = 2*(a+b);
            System.out.println("Dikdörtgenin çevresi: " + cevre);
        } else {
            System.out.println("Dikdörtgenin kenarı 0 olamaz.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        System.out.println("Lütfen bir işlem seçiniz: ");
        select = input.nextInt();

        if ( select != 0){

            switch (select){
                case 1:
                    plus();
                    break;

                case 2:
                    minus();
                    break;

                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;

                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;

                case 7:
                    mod();
                    break;

                case 8:
                    rec();
                    break;

                case 0:
                    break;
            }

        }
    }
}
