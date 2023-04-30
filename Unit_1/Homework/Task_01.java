
/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 Треугольное число 1 + 2 + 3 + 4 + 5 = 15
 n! 1 * 2 * 3 * 4 * 5 = 120
 * 
 */

import java.util.Scanner;

public class Task_01 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        clearScreen();
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Enter natural number: ");
        if (!scn.hasNextInt()) {
            System.out.println("You entered wrong number!!!");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("You should enter positive number only!!!");
            else {
                System.out.printf("The triangle number of %d is: %s! ", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("The factorial of %d is: %s! ", n, getFactorial(n));
            }
        }
        scn.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}