package Unit_1.Practice;

import java.util.Arrays;
import java.util.Random;

/**
 * Exercise_2
 */
public class Exercise_2 {
    public static void main(String[] args) {
        clearScreen();
        Random items = new Random();
        final int val = 3;
        int[] arr = new int[items.nextInt(0, 100)]; // { 3, 2, 4, 3, 2, 5, 3 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = items.nextInt(2, 4);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == val) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = val;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}