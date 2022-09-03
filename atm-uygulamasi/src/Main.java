
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 2000;

        while (right > 0) {
            System.out.print("Enter your username:");
            userName = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (userName.equals("korsan") && password.equals("1234")) {
                System.out.println("Welcome to Begonya Bank!");

                do {
                    System.out.println("1: Deposit\n2: Withdraw\n3: Check the balance\n4: Exit ");
                    System.out.print("Choose the operation you want to perform: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Enter money to be deposited: ");
                            int invest = input.nextInt();
                            balance += invest;
                            System.out.println("Your Money has been successfully deposited");
                            break;
                        case 2:
                            System.out.println("Enter money to be withdrawn: \n");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Insufficient balance!");
                            } else {
                                balance -= withdraw;
                                System.out.println("Please collect your money");
                                break;
                            }
                        case 3:
                            System.out.println("Balance :" + balance);
                            break;


                    }


                } while (select != 4);
                System.out.println("Have a nice day. See you!");
                break;
            }else {
                right--;

                System.out.println("Wrong username or password. Try again.");
                if (right==0){
                    System.out.println("Your card has been blocked. Please contact the bank.");
                }else {
                    System.out.println("You have " + right + " attempts left.");
                }
            }
        }
    }
}