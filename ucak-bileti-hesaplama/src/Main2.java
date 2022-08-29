import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int distance, age, type ;
        double totalPrice = 0 ;

        System.out.print("Mesafeyi KM türünden giriniz : ");
        distance = input.nextInt();

        if (distance <= 0) System.out.println("Hatalı giriş yaptınız.");

        totalPrice += (distance * 0.1);
        System.out.println("İndirimsiz bilet fiyatı : " + (distance * 0.1) + "₺");
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        if (age < 0) {
            System.out.println("Hatalı giriş yaptınız.");

        } else if (age >= 0 && age <12) {
            totalPrice -= (totalPrice/2);
            System.out.println("Yaş indirimi sonucu tutar : " + (totalPrice) + "₺");
        } else if (age >= 12 && age < 24){
            totalPrice -= (totalPrice*0.1);
            System.out.println("Yaş indirimi sonucu tutar : " + (totalPrice) + "₺");
        } else if (age > 65) {
            totalPrice -= (totalPrice * 0.3);
            System.out.println("Yaş indirimi sonucu tutar : " + (totalPrice) + "₺");
        }

        System.out.print("Yolculuk tipinizi seçiniz [1: Tek-Yön / 2: Gidiş-Geliş]: ");
        type = input.nextInt();
        switch (type){
            case 1 :
                System.out.println("Bilet türüne göre bir indirim uygulanmadı.");
                break;
            case 2 :
                totalPrice -= (totalPrice * 0.2);
                totalPrice *= 2;
                System.out.println("Bilet türüne göre indirim sonucu tutar : " + totalPrice + "₺");
                break;
            default :
                System.out.println("Hatalı giriş yaptınız.");
                break;

        }
        System.out.println("Ödenecek tutar : " + totalPrice + "₺");
    }
}