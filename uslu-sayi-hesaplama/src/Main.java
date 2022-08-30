import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz: ");
        int taban = input.nextInt();
        System.out.println("Üs sayıyı giriniz: ");
        int us = input.nextInt();

        int uslu = 1;

        for (int i=1; i<=us ; i++ ){
            uslu *=taban;
        }
        System.out.println(taban + "^" + us + " = " + uslu);
    }
}
