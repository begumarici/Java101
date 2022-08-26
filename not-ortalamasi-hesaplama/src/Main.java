import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //degiskenleri olustur
        int mat, fizik, kimya , turkce, tarih, muzik;

        // Scanner tanimla
        Scanner inp = new Scanner(System.in);

        // kullanicidan input al
        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();

        int total =  ( mat + fizik + kimya + tarih + turkce + muzik);
        double result = total / 6.0;
        System.out.println("Not ortalamanız: " + result);
        System.out.println(result >= 60 ? "Tebrikler! Sınıfı başarıyla tamamladınız." : "Sınıfta kaldınız!");


    }
}
















