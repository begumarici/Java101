import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String numbers = "";

        for (int i = 1; i <= 100; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayac ++;
                }
            }
            if (sayac == 2) {
                numbers = numbers + i + " ";
            }
        }
        System.out.println(numbers);
    }
}