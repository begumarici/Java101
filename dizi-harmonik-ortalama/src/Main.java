import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {45,234,64,34,5,4};

        double result = 0;
        for (int i = 0; i<list.length; i++){
            result+= 1.0/list[i];

        }

        System.out.println(Arrays.toString(list) + " sayılarının harmonik ortalaması: " + list.length/result);


    }
}
