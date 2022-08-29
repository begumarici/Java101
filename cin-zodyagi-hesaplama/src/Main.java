import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int year;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Doğum yılınızı giriniz: ");
        year = Integer.parseInt(br.readLine());
        int remainder = year%12;
        String [] zodyak = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
        System.out.println("Çin zodyağı burcunuz: " + zodyak[remainder]);
    }
}
