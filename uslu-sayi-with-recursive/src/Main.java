import java.util.Scanner;

public class Main {
    static int f(int a, int b){
        int t = 1;

        if (a == 1 || b == 0){
            return 1;
        }
        return f(a,b-1) * a;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz: ");
      int a = input.nextInt();
        System.out.println("Üs sayıyı giriniz: ");
       int b = input.nextInt();

        System.out.println("Sonuç: " + f(a,b));
    }
}
