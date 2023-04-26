package Unit_1.Practice;

import java.util.Arrays;
import java.util.Random;

/**
 * Exercise_1
 */
public class Exercise_1 {

    public static void main(String[] args) {
        clearScreen();
        int[] arr = new int[] { 1, 1, 2, 3, 1, 1, 1, 1 };
        int max_count = 0;
        int step_count = 0;
        System.out.printf(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                step_count++;

            } else {
                if (max_count > step_count)
                    ;
                max_count = step_count;
                step_count = 0;
            }
            if (max_count > step_count)
                ;
            max_count = step_count;
        }
        System.out.printf("\nmax_count = %d\n", max_count);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

/**
 * Exercise_1 random
 */
public class Exercise_1 {

    public static void main(String[] args) {
        Random items = new Random();

        clearScreen();
        int[] arr = new int[items.nextInt(0, 100)];// { 1, 1, 2, 3, 1, 1, 1, 1 };
        int max_count = 0;
        int step_count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = items.nextInt(0, 2);

            if (arr[i] == 1) {
                step_count++;

            } else {
                if (max_count < step_count)
                    max_count = step_count;
                step_count = 0;
            }
            if (max_count < step_count)
                max_count = step_count;

        }
        System.out.printf(Arrays.toString(arr));
        System.out.printf("\nmax_count = %d\n", max_count);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}