public class Main {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange"};

        System.out.println("orange - " + isItHasWord(fruits, "orange"));
        System.out.println("banana - " + isItHasWord(fruits, "banana"));

        System.out.println();
        changeLongestWord(new String[]{"apple", "orange", "grape"});

    }

    /*
    Задание 1
Создайте метод, который принимает массив String[] arr и слово String word;
Метод должен возвращать true - если слово есть в массиве,
false - если его нету. Метод не должен менять исходный массив.

Примеры:
для параметров {"apple", "orange"}, "orange" --> true;
для параметров {"apple", "orange"}, "banana" --> false;
*/
    public static boolean isItHasWord(String[] arr, String word) {
     //   boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(word)) {
                // return res = true;
                return true;
            }
        }
      //  return res;
        return false;
    }
/*
Задание 2 *
Создайте метод, который принимает массив слов, и заменяет самое длинное слово на "***".

Например,для массива {"apple", "orange", "grape"} вызов метода изменит массив на {"apple", "***", "grape"}.
Данный метод должен менять исходный массив.
     */

    public static void changeLongestWord(String[] array) {
        System.out.println("first array");
        printArray(array);
        array[getIndexOfMax(array)] = "***";
        System.out.println("array with mutation");
        printArray(array);
    }

    public static int getIndexOfMax(String[] array) {  // взять индекс ячейки
        int indexMax = 0;
        int temp = array[0].length(); // длинна первого
        for (int i = 1; i < array.length; i++) {
            if (temp <= array[i].length()) {     // если кто-то больше, перезаписываем
                temp = array[i].length();
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}