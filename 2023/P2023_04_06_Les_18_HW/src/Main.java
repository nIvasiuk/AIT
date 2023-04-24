import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                /*
        1
Напишите метод, который создает массив размера n элементов и заполняет его
целыми числами по порядку, начиная с заданного числа start
Например, при n=4 и start = 5 метод должен вернуть массив {5,6,7,8}
Напишите метод, который умножает каждый элемент этого массива на 2.
Напишите метод вывода массива на экран
Ваша программа должна запрашивать у пользователя размер массива и начальное число,
выводить на экран исходный массив, затем выводить на экран массив с умноженными на 2 элементами
         */

        printArray(createArray(4, 5));
        System.out.println("******************");
        printArray(doubleArray(createArray(4, 5)));
        System.out.println("*******************");
        createAndPrintArray();
    }

    public static void createAndPrintArray() {
        int capacity = enterCapacity();
        int start = enterStartElement();
        int[] array = new int[capacity];
        int[] newArray = createArray(capacity, start);

        printArray(newArray);
        System.out.println("***** double array *****");
        doubleArray(newArray);
        printArray(newArray);
    }

    public static int enterCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int capacity = scanner.nextInt();
        return capacity;
    }

    public static int enterStartElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение массива");
        int start = scanner.nextInt();
        return start;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("index %d - %d%n", i, array[i]);
        }
    }
    public static int[] createArray(int capacity, int start) {
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = start;
            start++;
        }
        return array;
    }

    public static int[] doubleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        return array;
    }

}