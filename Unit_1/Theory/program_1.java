/**
 * Основы: типы данных
 */
class program_1 {
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456
    }
}

/**
 * Основы: типы данных
 */

class program_1 {
    public static void main(String[] args) {
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415
    }
}

/**
 * Основы: типы данных
 */

class program_1 {
    public static void main(String[] args) {
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
    }
}

/**
 * Основы: типы данных
 */

public class program_1 {
    public static void main(String[] args) {
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
    }
}