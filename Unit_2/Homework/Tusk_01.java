package Unit_2.Homework;

import java.util.Arrays;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Tusk_01
 */
public class Tusk_01 {

    public static void main(String[] args) {
        clearScreen();
        File file = new File("random_numbers.txt");

        Random items = new Random(0);
        int[] arr = new int[items.nextInt(0, 100)];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = items.nextInt(-100, 100);
        }

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < arr.length; i++) {
                writer.write(arr[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(arr));
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < arr.length; i++) {
                writer.write(arr[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
