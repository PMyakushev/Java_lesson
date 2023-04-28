// Простой пример
// Создать строку из 1 млн плюсиков. Как?
/**
 * program_0
 */
public class program_0 {
    public static void main(String[] args) {

        // String str = "";
        // for (int i = 0; i < 1_000_000; i++) {
        // str += "+";
        // }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }

    }
}

public class program_0 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        // String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            // str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        // System.out.println(str);
        // System.out.println(sb);
    }
}
