/**
 * // Циклы
 * Цикл — это многократное выполнение одинаковой
 * последовательности действий.
 * В java доступны следующие циклы:
 * ● цикл while;
 * ● цикл do while;
 * ● цикл for; и его модификация for in
 */

// Цикл while

public class program_13 {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }
}

// Цикл do while

public class program_13 {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }}continue,break

/**
 * Операторы для управления циклами—continue и break.
 * Выполнение следующей итерации цикла—continue.
 * Прерывание текущей итерации цикла—break.*
 * ближайшего к оператору
 */
// Оператор цикла for

public class program_13 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }
}

// Вложенные циклы

public class program_13 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
    }
}

// for:Работает только для коллекций

public class program_13 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
