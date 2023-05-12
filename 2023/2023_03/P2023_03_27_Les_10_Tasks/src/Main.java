import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Выбираем любую тему.
        // Панды
        // 1. Сколько зубов у панды?
        //  если пользователь вводит 38 - "Правильный ответ"
        //  если вводит неправильный ответ:
        // - "Неправильный ответ"

        // дополнительно *
        // если вводит неправильный ответ:
        // "Неверно, правильный ответ: <правильный ответ>"

        // дополнительно *
        // Чтобы в конце выводился подсчет очков
        // "Правильно отвечено на 3 из 5 вопросов"

        // дополнительно **
        // добавить вторую попытку ответа
        // answer.equals("мяч")

        int score = 0;

        System.out.println("Вопрос 1. \nСколько сезонов в году?");
        Scanner scanner = new Scanner(System.in);
        int answerUser1 = scanner.nextInt();
        int answer1 = 4;
        boolean isAnswer1 = answerUser1 == answer1;
        if (isAnswer1){
            System.out.println("Правильный ответ");
            System.out.println("Ваш счёт: " + (score += 1) + " из 2");
        } else {
            System.out.println("Неправильный ответ");
          //  System.out.println("Неверно, правильный ответ: " + answer1);
            System.out.println("Ваш счёт: " + (score) + " из 2");
            System.out.println("Попробуй ещё раз!");
            int answerUser11 = scanner.nextInt();
            if (answerUser11 == answer1){
                System.out.println("Правильный ответ");
                System.out.println("Ваш счёт: " + (score += 1) + " из 2");
            } else {
                System.out.println("Неверно, правильный ответ: " + answer1);
                System.out.println("Ваш счёт: " + (score) + " из 2");
            }
        }

        System.out.println("Вопрос 2. \nКак называется сезон после зимы?");
        scanner.nextLine();
        String  answerUser2 = scanner.nextLine();
        String answer2 = "весна";
        boolean isAnswer2 = answerUser2.equalsIgnoreCase(answer2);
        if (isAnswer2){
            System.out.println("Правильный ответ");
            System.out.println("Ваш счёт: " + (score += 1) + " из 2");
        } else {
            System.out.println("Неправильный ответ");
            System.out.println("Ваш счёт: " + (score) + " из 2");
            System.out.println("Попробуй ещё раз!");
            String answerUser21 = scanner.nextLine();
            if (answerUser21.equalsIgnoreCase(answer2)){
                System.out.println("Правильный ответ");
                System.out.println("Ваш счёт: " + (score += 1) + " из 2");
            } else {
                System.out.println("Неверно, правильный ответ: " + answer2);
                System.out.println("Ваш счёт: " + (score) + " из 2");
            }
        }


    }
}