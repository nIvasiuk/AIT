import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Задание 1

Пусть пользователь введет свою температуру: например, 38.8.
Если температура больше 39, выведите в консоль фразу: «Нужно срочно обратиться к врачу».
Если температура меньше, то выведите фразу: «Лечитесь дома»
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        double temperature = scanner.nextDouble();

        if ( temperature > 39){
            System.out.println("Нужно срочно обратиться к врачу");
        } else {
            System.out.println("Лечитесь дома");
        }

    }
}