/**
 * Управляющие конструкции
 */

// Управляющие конструкции: условный оператор
public class program_11_11 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
    }
}

// Управляющие конструкции: условный оператор

public class program_11_11 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b)
            c = a;
        if (b > a)
            c = b;
        System.out.println(c);
    }
}

// Управляющие конструкции:тернарный оператор
public class program_11_11 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        System.out.println(min);
    }
}