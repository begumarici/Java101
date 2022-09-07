import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını girin: ");
        int eleman = input.nextInt();

        int arr[] = new int[eleman];

        for (int i = 0; i < arr.length; i++){
            System.out.println(i+1 + ". sayıyı gir:");
            arr[i]=input.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(j+1 + ". eleman: " + arr[j]);
        }
        Arrays.sort(arr);
        System.out.println("Sıralama: " + Arrays.toString(arr));

        input.close();
    }
}