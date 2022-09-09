import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------WELCOME TO MINE SWEEPER GAME!------------");
        System.out.println("Please enter how many row you want to play: ");
        int row = input.nextInt();
        System.out.println("Please enter how many column you want to play: ");
        int column = input.nextInt();

        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
    }
}