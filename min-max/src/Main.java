import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0;
        System.out.println("How many numbers do you want to enter?");
        int n = input.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Enter number " + i);
            int num = input.nextInt();

            if ( i == 1) {
                max = num;
                min = num;
            }

            if ( num > max) {
                max = num;
            }

            if ( num < min ){
                min = num;
            }

        }

        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);





        }
    }




