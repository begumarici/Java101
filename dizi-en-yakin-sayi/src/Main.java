import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int list[] = {56, 34, 1, 8, 101, -2, 33};

        int min = list[0];
        int max = list[0];

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Bir sayı giriniz: ");
        int number = input.nextInt();

        Arrays.sort(list);
        for (int i: list){
            if (i < number){

                min = i;
            }
            if (i > number){

                max = i;
                break;
            }
        }


        System.out.println("Girilen sayıdan büyük en küçük sayı: " + max);
        System.out.println("Girilen sayıdan küçük en büyük sayı: " + min);
    }
}
