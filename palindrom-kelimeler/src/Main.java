import java.util.Scanner;

public class Main {

    static String isPalindrom(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return "palindrom değil";

                i++;
                j--;
            }
            return "palindrom";
    }


    public static void main(String[] args) {
        System.out.println("Bir kelime giriniz: ");
        Scanner input = new Scanner(System.in);
        String value;
        value = input.nextLine();
        System.out.println(isPalindrom(value));
    }
}
