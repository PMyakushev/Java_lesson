
/**
 * Реализовать простой калькулятор

Введите первое число: 12
Введите операцию: +
Введите второе число: 1

 */

import java.util.Scanner;

public class Task_03 {
    // метод получения числа
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
        // scan.close(); Почему не получается закрыть Scanner???
    }

    // метод получения числа операции
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    // метод получения результата
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        clearScreen();
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();

        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
