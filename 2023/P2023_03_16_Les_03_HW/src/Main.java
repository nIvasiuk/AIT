import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*  Задание 1

1. Создайте новый модуль в IDEA.
2. Напишите программу, коорая запрашивает у поользователя следующие данные:
Имя
Возраст
Город
Ваша программа должна выводить на экран следующее:
Jack (г.Берлин), возраст: 25
В комментариях укажите, сколько времени заняло решение.

*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.next();

        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("Введите город: ");
        String city = scanner.next();

        System.out.println(name + " (г." + city + "), возраст: " + age);

        /* Заняло около 10 минут.
        Консоль:
        Введите имя:
        Nadiia
        Введите возраст:
        25
        Введите город:
        Berlin
        Nadiia (г.Berlin), возраст: 25

         */

        /*
Задание 2

Следующая версия вашей программы, должна уметь выводить на экран что то такое:

Jack (г.Берлин), возраст: 25
Сейас 2023 год. Год рождения: 1998
Верно?

 */

        int birthYear = 2023 - age;
        System.out.println("Сейас 2023 год. Год рождения: " + birthYear + "\nВерно?");

/*
        Заняло так же около 10 минут. В основном на то, что бы напечатать :)
        Консоль:


Nadiia (г.Berlin), возраст: 25
Сейас 2023 год. Год рождения: 1998
Верно?

 */

    }
}