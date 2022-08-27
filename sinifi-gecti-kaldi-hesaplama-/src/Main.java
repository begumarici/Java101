import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik, avg;
        int toplamDers= 0, toplamNot= 0;

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if(!(mat < 0 || mat >100)){
            toplamNot += mat;
            toplamDers++;
        }

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if(!(fizik < 0 || fizik >100)){
            toplamNot += fizik;
            toplamDers++;
        }

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if(!(turkce < 0 || turkce >100)){
            toplamNot += turkce;
            toplamDers++;
        }

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if(!(kimya < 0 || kimya >100)){
            toplamNot += kimya;
            toplamDers++;
        }

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if(!(muzik < 0 || muzik >100)){
            toplamNot += muzik;
            toplamDers++;
        }

        avg = (toplamNot/toplamDers);
        System.out.println(avg >= 55 ? "Ortalamanız: " + avg + "\nTebrikler! Sınıfı geçtiniz." : "Ortalamanız: " + avg + "\nSınıfta kaldınız.");
    }
}
