package Unit_2.Practice;

import javax.swing.plaf.synth.SynthDesktopIconUI;

/**
 * Exercise_2
 */
public class Exercise_2 {
    public static void main(String[] args) {

        int n = 20;
        String c1 = "a";
        String c2 = "b";
        extracted(n, c1, c2);
    }

    private static void extracted(int n, String c1, String c2) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            result.append(c1 + c2);

        }
        System.out.printf("s%\n", result.toString());
    }

    private static boolean palindrom(String word) {
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }
}