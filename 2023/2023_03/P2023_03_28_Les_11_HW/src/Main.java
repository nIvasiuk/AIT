import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1
Пользвтель вводит с клавиатуры номер месяца (числом), ваша программа должна выводить строку вида:
"Месяц № __ это название_месяца"
Например, если пользователь ввел 2, то
"Месяц №2 это февраль"
Для вывода строки используйте printf

*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца (числом)");
        int numberOfMonth = scanner.nextInt();

        switch (numberOfMonth){
            case 1 :
                System.out.printf("Месяц № %d - это январь %n", numberOfMonth);
                break;
            case 2 :
                System.out.printf("Месяц № %d - это февраль %n", numberOfMonth);
                break;
            case 3 :
                System.out.printf("Месяц № %d - это март %n", numberOfMonth);
                break;
            case 4 :
                System.out.printf("Месяц № %d - это апрель %n", numberOfMonth);
                break;
            case 5 :
                System.out.printf("Месяц № %d - это май %n", numberOfMonth);
                break;
            case 6 :
                System.out.printf("Месяц № %d - это июнь %n", numberOfMonth);
                break;
            case 7 :
                System.out.printf("Месяц № %d - это июль %n", numberOfMonth);
                break;
            case 8 :
                System.out.printf("Месяц № %d - это август %n", numberOfMonth);
                break;
            case 9 :
                System.out.printf("Месяц № %d - это сентябрь %n", numberOfMonth);
                break;
            case 10 :
                System.out.printf("Месяц № %d - это октябрь %n", numberOfMonth);
                break;
            case 11 :
                System.out.printf("Месяц № %d - это ноябрь %n", numberOfMonth);
                break;
            case 12 :
                System.out.printf("Месяц № %d - это декабрь %n", numberOfMonth);
                break;
            default: System.out.printf("Число введено неверно %n");
        }

/*
Задача 2
Пользвтель вводит с клавиатуры месяц (строкой), ваша программа должна выводить строку вида:
"название_месяца это сезон"
Например, если пользователь ввел февраль, то
"февраль это зима"
Для вывода строки используйте printf
         */

        System.out.printf("%nВведите номер месяца (строкой) %n");
        scanner.nextLine(); //fix
        String nameOfMonth = scanner.nextLine();

        switch (nameOfMonth.toLowerCase()){
            case "декабрь" :
            case "январь" :
            case "февраль" :
                System.out.printf( "%s это зима %n", nameOfMonth);
                break;
            case "март" :
            case "апрель" :
            case "май" :
                System.out.printf( "%s это весна %n", nameOfMonth);
                break;
            case "июнь" :
            case "июль" :
            case "август" :
                System.out.printf( "%s это лето %n", nameOfMonth);
                break;
            case "сентябрь" :
            case "октябрь" :
            case "ноябрь" :
                System.out.printf( "%s это осень %n", nameOfMonth);
                break;
            default: System.out.printf("Значение введено неверно %n");
        }


    }
}