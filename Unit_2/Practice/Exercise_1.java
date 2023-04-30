package Unit_2.Practice;

/**
 * Exercise_1
 */
public class Exercise_1 {
    // public static void main(String[] args) {
    // int n = 20;
    // String c1 = "a";
    // String c2 = "b";
    // StringBuilder result = new StringBuilder("");
    // for (int i = 0; i < n / 2; i++) {
    // result.append(c1 + c2);
    // }
    // System.out.print(result);
    // }

    public static void main(String[] args) {
        int n = 20;
        String c1 = "a";
        String c2 = "b";
        extracted(n, c1, c2);
    }

    private static void extracted(int n, String c1, String c2) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < n / 2; i++) {
            result.append(c1 + c2);
        }
        System.out.print(result);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
