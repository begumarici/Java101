import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.println("Sıcaklık giriniz: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >=5 && heat <=15){
            System.out.println("Sinemaya gidebilirsiniz. ");
        } else if (heat >15 && heat <=25){
            System.out.println("Piknik yapabilirsiniz. ");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz. ");
        }

    }
}
