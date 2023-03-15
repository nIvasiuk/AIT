/* Задание 1
Создайте 3 переменные:
Адрес здания
Количество этажей
Количество проживающий людей.
Выведите переменные в консоль, чтобы получилась фраза по образцу: Адрес, 6 этажей, 300 человек.
Пример: «ул. Горького 18, 7 этажей, 120 человек».
 */

public class Main {
    public static void main(String[] args) {
        String address = "Berliner str., 666";
        int flourNumbers = 7;
        int peopleNumbers = 300;
        System.out.println(address + ", " + flourNumbers + " floors, " + peopleNumbers + " people");
    }
}