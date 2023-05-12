import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 1
Напишите программу, которая просит пользоввателя ввести слово, после чего выводит на экран,
что-то типа (например введено слово "Програмирование") :

Слово: "Програмирование"
Количество букв: 15
Начинается на: П
Заканчивается на е
Подсказка: посмотрите в классной работе, как можно добавить к строке ковычки. Посмотрите на использование методов charAt и lenght
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String usersWord = scanner.next();

        System.out.println("------------Task 1: ------------");
        System.out.println("Слово: \"" + usersWord + "\" \n" +
                "Количество букв: " + usersWord.length() +
                "\nНачинается на: " + usersWord.charAt(0) +
                "\nЗаканчивается на: " + usersWord.substring(usersWord.length()-1)
        );

        /*        2
Напишите программу, которая просит пользоввателя ввести слово,
после чего выводит на экран, перввые три символа введенного слова
а оставшуюся часть слова в строку. Например ввели слово "Програмирование";

П
р
о
грамирование
* в рамках данной задачи преддполагается, что пользователь вводит слово длиннее 3 символов.
         */

        System.out.println("\n------------Task 2: ------------");
        System.out.println(usersWord.charAt(0) +
                "\n" + usersWord.charAt(1) +
                "\n" + usersWord.charAt(2) +
                "\n" + usersWord.substring(3));

/*   3
Задача аналогичная предыдущей, но сначаловыводится часть строки без последних 3х символов,
а потом выводятся последние три символла строки в столбик. Например ввели слово "Програмирование";

Програмирова
н
и
е
* в рамках данной задачи преддполагается, что пользователь вводит слово длиннее 3 символов.
        */

        System.out.println("\n------------Task 3: ------------");
        System.out.println(usersWord.substring(0,usersWord.length()-3) +
                "\n" + usersWord.charAt(usersWord.length()-3) +
                "\n" + usersWord.charAt(usersWord.length()-2) +
                "\n" + usersWord.charAt(usersWord.length()-1));

        /* 4*
Напишите программу, которая просит пользоввателя ввести строку,
после чего выводит на экран, введенную строку, в две строчки (причем строчки должны быть равны,
или вторая строчка может быть короче на 1 символ). Например, ввели "Java современный язык программирования !", тогда:

Java современный язы
к программирования!
* в рамках данной задачи преддполагается, что пользователь вводит слово длиннее 3 символов.
         */

        System.out.println("\n------------Task 4: ------------");
        System.out.println("Введите строку: ");
        scanner.nextLine(); // фикс - чтобы не съедалась строка

        String usersString = scanner.nextLine();
        System.out.println("Ваша строчка: " + usersString + ", кол. символов: " + usersString.length());

        String firstPart = usersString.substring(0, usersString.length()/2);
        String secondPart = usersString.substring(usersString.length()/2);

        System.out.println("\nРезультат: " +
                "\n" + firstPart +
                "\n" + secondPart);


    }
}