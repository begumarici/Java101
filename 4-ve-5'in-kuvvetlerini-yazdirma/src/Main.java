import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");
        int number=input.nextInt();


        System.out.print( number+ " sayısından küçük dördün kuvvetleri:\n ");
        for (int i=1; i<=number; i*=4){
            System.out.print(i + "   \n");
        }

        System.out.print( number+ " sayısından küçük beşin kuvvetleri:\n ");
        for (int i=1; i<=number; i*=5){
            System.out.print(i + "   \n");
        }

    }
}