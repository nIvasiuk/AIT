public class Main {
    public static void main(String[] args) {

   // printCountDown();
     //   System.out.println(accumulation());
        System.out.println(multiplyString("apple", 3));
        System.out.println(multiplyString("cat_", 7));
    }

    public static void printCountDown(){
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Go!");
    }

    /*
         Напишите метод который ничего не принимает в качестве параметров
         возвращает int сумму чисел от 1 до 120.
         (1 + 2 + 3 + .... + 120)
         Вам понадобится отдельная переменная для суммы,
         значение в которой вы будете обновлять.
         Подсказка, подумайте, где ее объявить.
         */

    public static int accumulation(){
        int sum = 0;
        for (int i = 1; i <= 120; i++){
            sum += i;

        }
        return sum;
    }

    /*
    Создайте метод multiplyString, который принимает:
        String word - слово
        int n - количество повторений
    Метод возвращает тип String, слово повторенное n раз.
    Пример вызова метода:
        multiplyString("apple", 3); --> "appleappleapple"
        multiplyString("cat_", 7); --> "cat_cat_cat_cat_cat_cat_cat_"
    P.S. Используйте цикл, а не метод repeat
     */

    public static String multiplyString(String word, int n){
        String newWord = "";
        for (int i = 0; i < n; i++){
            newWord =newWord+word;
                    }
        return newWord;
    }
}