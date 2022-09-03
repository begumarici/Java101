import java.util.Scanner;

public class Main {
    static int fib(int n){

        if(n == 1){
            return 0;
        }
        if ( n ==2 || n == 3){
            return 1;
        }
        return fib(n-1) + fib(n -2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaçıncı adım: ");
        int x = input.nextInt();
        System.out.println(x + ". fibonacci sayısı: " + fib(x));
    }
}