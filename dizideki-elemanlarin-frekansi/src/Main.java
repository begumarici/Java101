import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 5, 7, 2, 7, 7, 8, 4, 5, 9, 1};
        int[] frekans = new int[list.length];

        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++)
            frekans[i] = 1;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    frekans[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    list[j] = 1;
                }
            }
        }


        for (int i = 0; i < list.length; i++) {
            if (frekans[i] > 1) {
                if (list[i] != 0)
                    System.out.println(list[i] + " sayısı " + frekans[i] + " kere tekrar edildi.");
            }
        }
    }
}