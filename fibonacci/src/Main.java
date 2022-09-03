import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int number,a=0,b=1,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayısı: ");
        number = input.nextInt();

        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i < number; i++){
            c = b + a;
            a = b;
            b = c;
            System.out.print( c + " ");
        }
    }
}
