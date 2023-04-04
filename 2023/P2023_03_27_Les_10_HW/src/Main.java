import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Задача 1
Написать программу для подсчета длинны окружности и площади круга.
Задайте значение радиуса в программе и выведите на экран значение периметра и площади.
C = 2 π ⋅ R //bcircumference
S = π × r2
*/

        double radius = 4;
        double circumference = Math.PI*2*radius;
        double area = Math.PI*radius*radius;

        System.out.println("Длинна окружности круга " + Math.round(circumference));
        System.out.println("Площадь круга " + Math.round(area));
         /*
Задача 2
Написать программу, которая спрашивает у пользователя его настроение, дальше два варианта:

если ответ был "хорошо": выводит в консоль "Рад за тебя".
если ответ был любой другой: спрашивает: "Но ты же оптимистично настроен?"
- если ответ на второй вопрос: да - выводит "Так держать"
- если ответ на второй вопрос любой другой - выводит "Не кисни!"
         */
        System.out.println("------------- Task 2 ---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как настроение? ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("хорошо")){
            System.out.println("Рад за тебя");
        }else {
            System.out.println("Но ты же оптимистично настроен? ");
            String answerTwo = scanner.nextLine();
            if (answerTwo.equalsIgnoreCase("да")) {
                System.out.println("Так держать");
            } else {
                System.out.println("Не кисни!");
            }


        }


    }
}