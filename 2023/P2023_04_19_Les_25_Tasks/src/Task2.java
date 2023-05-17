import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*
        // Создайте ArrayList стрингов
        // Положите в него следующие значения:
        // "apple", "orange", "lime", "mango"
        // Выведите лист в консоль.
        // Замените "lime" на "lemon"
        // Распечатайте ArrayList
         */

        ArrayList <String> fruits  = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lime");
        fruits.add("mango");

        System.out.println(fruits);

        fruits.set(2,"lemon");
        System.out.println(fruits);

        // Создайте arrayList чисел, назовите его numbers2
        // Добавьте произвольное число чисел
        // С помощью цикла просуммируйте все значения в ArrayList
        // Выведите эту сумму в консоль

        ArrayList <Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);
        numbers2.add(50);

        int counter = 0;
        for (int i = 0; i < numbers2.size(); i++) {
            counter += numbers2.get(i);
        }

        System.out.println(counter);


    }
}
