import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, event, newPass;


        System.out.println("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.println("Şifreniz: ");
        password = input.nextLine();

        if (userName == " " || password == " "){
            System.out.println("Lütfen boş bırakmayın!");
        } else {
            if (!password.equals("1234")) {
                System.out.println("Girdiğiniz şifre yanlış.\n Şifrenizi sıfırlamak ister misiniz? [e / h]");
                event = input.nextLine();
                switch (event){
                    case "e":
                    case "E":
                        System.out.println("Yeni şifrenizi giriniz: ");
                        newPass = input.nextLine();
                        System.out.print(newPass.equals("1234") ? "Yeni şifreniz eskisiyle aynı olamaz.\nLütfen farklı bir şifre giriniz."
                                : "Şifreniz oluşturuldu.");
                        break;

                    case "h":
                    case "H":
                        System.out.println("Şifreniz değiştirilmedi.");
                        break;
                }

            }else {
                System.out.println("Giriş yaptınız. Hoşgeldin, " + userName);
            }
        }

    }

}
