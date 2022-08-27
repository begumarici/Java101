import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, total;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç KG? ");
        armut = input.nextDouble();
        System.out.println("Elma Kaç KG? ");
        elma = input.nextDouble();
        System.out.println("Domates Kaç KG? ");
        domates = input.nextDouble();
        System.out.println("Muz Kaç KG? ");
        muz = input.nextDouble();
        System.out.println("Patlıcan Kaç KG? ");
        patlican = input.nextDouble();

        total = (armut*14.75)+(elma*19.90)+(domates*10.45)+(muz*29.90)+(patlican*12.45);

        System.out.println("Toplam tutar: " + total + "₺");
    }
}
