import java.util.Scanner;

public class MineSweeper {

    int row;
    int column;

    MineSweeper(int row, int column){
        if (row > 0 && row < 50)
            this.row = row;
        else
            System.out.println("Please enter row value between 0 and 50!");

        if (column > 0 && column < 50)
            this.column = column;
        else
            System.out.println("Please enter column value between 0 and 50!");
    }

    void run(){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[this.row][this.column];
        int area = this.row*this.column;
        int mineNum = area/4;

        int mineCounter = 0;
        boolean isFinished = false;
        while(!isFinished) {
            int counter = 0;
            int rand = (int) (Math.random() * area);

            boolean isBreak = false; //for breaking the outer loop too.

            for (int j = 0; j < this.row; j++) {
                for (int k = 0; k < this.column; k++) {
                    if (counter == rand) {
                        if (arr[j][k] == -1) {
                            isBreak = true;
                            break;
                        }

                        mineCounter++;
                        arr[j][k] = -1; // Placing the mine
                        isBreak = true;
                        break;
                    } else
                        counter++;
                }

                if (isBreak)
                    break;
            }
            if (mineCounter == mineNum)
                isFinished = true;
        }

        System.out.println("The places of mines: ");
        for(int j=0; j<this.row; j++) {
            for (int k = 0; k < this.column; k++) {
                if(arr[j][k] == -1)
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }

        System.out.println();

        int nums = 0;
        isFinished = false;
        int[][] arr2 = new int[this.row][this.column];
        while(!isFinished){

            for(int i=0; i<this.row; i++){
                for(int j=0; j<this.column; j++){
                    int counter = 0;

                    if(arr[i][j] == -1){
                        arr2[i][j] = arr[i][j];
                        continue;
                    }
                    else if(i==0 && j==0){//corner 1
                        if(arr[i+1][j] == -1)
                            counter++;
                        if(arr[i][j+1] == -1)
                            counter++;
                        if(arr[i+1][j+1] == -1)
                            counter++;
                        nums++;
                    }
                    else if(i==0 && j==this.column-1){//corner 2
                        if(arr[i][j-1] == -1)
                            counter++;
                        if(arr[i+1][j-1] == -1)
                            counter++;
                        if(arr[i+1][j] == -1)
                            counter++;
                        nums++;
                    }
                    else if(j==0 && i==this.row-1){//corner 3
                        if(arr[i-1][j] == -1)
                            counter++;
                        if(arr[i-1][j+1] == -1)
                            counter++;
                        if(arr[i][j+1] == -1)
                            counter++;
                        nums++;
                    }
                    else if(j==this.column-1 && i==this.row-1){//corner 4
                        if(arr[i-1][j-1] == -1)
                            counter++;
                        if(arr[i-1][j] == -1)
                            counter++;
                        if(arr[i][j-1] == -1)
                            counter++;
                        nums++;
                    }
                    else if(i==0){//corner 1 to 3
                        if(arr[i][j-1] == -1)
                            counter++;
                        if(arr[i+1][j-1] == -1)
                            counter++;
                        if(arr[i+1][j] == -1)
                            counter++;
                        if(arr[i+1][j+1] == -1)
                            counter++;
                        if(arr[i][j+1] == -1)
                            counter++;
                        nums++;
                    }
                    else if(j==0){//corner 1 to 2
                        if(arr[i-1][j] == -1)
                            counter++;
                        if(arr[i-1][j+1] == -1)
                            counter++;
                        if(arr[i][j+1] == -1)
                            counter++;
                        if(arr[i+1][j+1] == -1)
                            counter++;
                        if(arr[i+1][j] == -1)
                            counter++;
                        nums++;
                    }
                    else if(i==this.row-1){//corner 2 to 4
                        if(arr[i][j-1] == -1)
                            counter++;
                        if(arr[i-1][j-1] == -1)
                            counter++;
                        if(arr[i-1][j] == -1)
                            counter++;
                        if(arr[i-1][j+1] == -1)
                            counter++;
                        if(arr[i][j+1] == -1)
                            counter++;
                        nums++;
                    }
                    else if(j==this.column-1){//corner 3 to 4
                        if(arr[i-1][j] == -1)
                            counter++;
                        if(arr[i-1][j-1] == -1)
                            counter++;
                        if(arr[i][j-1] == -1)
                            counter++;
                        if(arr[i+1][j-1] == -1)
                            counter++;
                        if(arr[i+1][j] == -1)
                            counter++;
                        nums++;
                    }
                    else{//center
                        if(arr[i-1][j] == -1)
                            counter++;
                        if(arr[i-1][j-1] == -1)
                            counter++;
                        if(arr[i][j-1] == -1)
                            counter++;
                        if(arr[i+1][j-1] == -1)
                            counter++;
                        if(arr[i+1][j] == -1)
                            counter++;
                        if(arr[i+1][j+1] == -1)
                            counter++;
                        if(arr[i][j+1] == -1)
                            counter++;
                        if(arr[i-1][j+1] == -1)
                            counter++;
                        nums++;
                    }

                    arr2[i][j] = counter;
                }
            }
            if(nums == area-mineNum)
                isFinished=true;
        }

        int row,column;
        int[][] display = new int[this.row][this.column];

        for(int i=0; i<this.row; i++){ //Making all the values -1 for identifying the sentinal value
            for(int j=0; j<this.column; j++) {
                display[i][j] = -1;
            }
        }

        isFinished = false;
        int counter = 0;
        while(!isFinished){
            if(counter == area-mineNum){
                System.out.println("You won the game!!!");
                isFinished = true;
                break;
            }
            displayMineSweeper(display, this.row, this.column);
            System.out.println("Enter row : ");
            row = input.nextInt();
            System.out.println("Enter column : ");
            column = input.nextInt();
            System.out.println("========================");
            if(arr2[row][column] == -1){
                System.out.println("Game over!!!");
                isFinished = true;
            }
            else{
                display[row][column] = arr2[row][column];
                counter++;
            }
        }
    }

    static void displayMineSweeper(int[][] display, int row, int column){
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(display[i][j] == -1)
                    System.out.print("- ");
                else
                    System.out.print(display[i][j] + " ");
            }
            System.out.println();
        }
    }
}