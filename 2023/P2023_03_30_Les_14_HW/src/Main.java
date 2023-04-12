public class Main {
    public static void main(String[] args) {
        System.out.println("******** Task 1 *************");
       // printEverySevenNumber();

        System.out.println("\n******** Task 2 *************");
       // printMultipliedByTwo();

        System.out.println("\n******** Task 3 *************");
        //printKantSpeaking();

        printKantSpeaking2();

    }
      /*
        Задание 1
Напишите метод. Каждый раз когда мы его вызываем - он печатает числа 7 14 21 28 35 … 98. Метод ничего не принимает.
*/

    public static void printEverySevenNumber() {
        int i = 7;
        while (i <= 98) {
            System.out.println(i);
            i = i + 7;
        }
    }


        /*

Задание 2
Выведите в консоль такую последовательность чисел 1 2 4 8 16 32 64 128 256 512.
*/

    public static void printMultipliedByTwo() {
        int i = 1;
        while (i <= 512) {
            System.out.println(i);
            i = i * 2;
        }
    }


    /*
Задание 4 (со звездочкой)
Имануил Кант любит считать свои шаги во время прогулки.
Прогулка его составляет 300 шагов.
Каждый шаг он считает в слух.
Но вместо чисел кратных 6 (это числа, которые делятся на 6 без остатка) он говорит - "Himmel und Erde".
Вместо ста он заявляет "Sagen Sie mir, kann man in Ihrem Land durch Null teilen?"
Выведите этот разговор Канта с самим собой в консоль.
         */

    public static void printKantSpeaking() {
        int i = 1;
        while (i <= 300) {
            if (i % 6 == 0) {
                System.out.println("Himmel und Erde");
            } else if (i == 100) {
                System.out.println("Sagen Sie mir, kann man in Ihrem Land durch Null teilen?");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printKantSpeaking2() {
        int i = 1;
        while (i <= 300) {
            System.out.println(kantsStep(i));
            i++;
        }
            }

    public static String kantsStep(int i) {
        if (i % 6 == 0) {
            return "Himmel und Erde";
        } else if (i == 100) {
            return "Sagen Sie mir, kann man in Ihrem Land durch Null teilen?";
        }
return String.valueOf(i);

    }
}