import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  bolum=0,bolunen=0,answer;
        System.out.println("Bir sayı giriniz: ");
        int number = input.nextInt();
        System.out.println("3'e ve 4'e tam bölünen sayılar: ");

        for (int i =0; i <= number; i++){
            if (i%12==0){
                System.out.println(i);
                bolum++;
                bolunen+=i;
            }
        }

        answer = bolunen/bolum;
        System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması: " + answer);
    }

}
