public class Main {
    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println();

        System.out.println(multiplyString("apple", 3));
        System.out.println(multiplyString("cat", 7));

    }
    /*
    Задание 1
Напишите метод, который возвращает сумму чисел от - 100 до -200.
Метод не принимает никаких параметров. И ничего не выводит в печать.
*/
    public static int getSum(){
        int acum = 0;
        for (int i = -100; i >= -200; i--){
            acum += i;
        }
        return acum;
    }

    /*
Задание 2
Создайте метод multiplyString, который принимает:

String word - слово;
int n - количество повторений.
Метод возвращает тип String, слово повторенное n раз.
Пример вызова метода:

multiplyString("apple", 3); --> "appleappleapple"
multiplyString("cat", 7); --> "catcatcatcatcatcatcat"
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