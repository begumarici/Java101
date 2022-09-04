import java.util.Scanner;

public class Main {
    static boolean checkPrime(int number,int i){
        if(number<=2){
            return number == 2;
        }
        if(number % i ==0){
            return false;
        }
        if(i * i >number){
            return true;
        }
        return checkPrime(number, i +1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

            System.out.print("Sayı giriniz: ");
            int number=input.nextInt();
            if(checkPrime(number,2)){
                System.out.println(number+" sayısı asaldır!");
            }else{
                System.out.println(number+" sayısı  asal değildir!");

        }
    }
}