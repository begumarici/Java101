import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, toplam=0;

        do {
            System.out.println("Sayı giriniz: ");
            number = input.nextInt();

            if (number%2== 0 && number%4 == 0){

                toplam += number;
            }
        }
        while (number%2 ==0) ;{
            System.out.println("Toplam = " + toplam);
        }
    }
}
