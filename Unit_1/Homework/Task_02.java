import java.util.Arrays;

/** Вывести все простые числа от 1 до 1000 */
public class Task_02 {
    public static void main(String[] args) {
        clearScreen();

        int input = 1000;
        for (int P = 1; P <= input; P++) {
            for (int i = 1; i < P; i++) {
                if (P % i == 0) {
                }
                System.out.println(P);
            }
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}