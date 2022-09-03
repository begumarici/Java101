import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number to see if it's a perfect number or not: ");
        int number = input.nextInt();

        for ( int i = 1; i < number; i++){
            if (number%i == 0){
                sum += i;
            }
        }
        if (sum == number){
            System.out.println(number + " is a perfect number.");
        } else{
            System.out.println(number + " is not a perfect number.");
        }

    }
}
