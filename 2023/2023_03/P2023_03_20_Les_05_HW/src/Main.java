import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/* таск 1
Создайте программу, которая запрашивает у пользователя объем куба
и вычисляет длину его стороны – после чего выводит в консоль.
Пусть результат округляется до верхнего значения.
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем куба: ");
        double cubeVolume = scanner.nextDouble();

        double cubeSide = Math.cbrt(cubeVolume);

        System.out.println("Сторона куба равна " + Math.ceil(cubeSide));

/* таск 2

Выведите в консоль по отдельности следующие символы - Ä, +, [, Æ, ¥
 */

        System.out.println('\u00C4');
        System.out.println('\u002B');
        System.out.println('\u005B');
        System.out.println('\u00C6');
        System.out.println('\u00A5');
    }
}