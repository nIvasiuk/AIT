public class Main {
    public static void main(String[] args) {

        int[] array = {1, 8, 0, 80, 145};
        System.out.println("-------- Task 1 -------");
        System.out.println(getMaxIndex(array));

        System.out.println("-------- Task  -------");
        System.out.println(getMinIndex(array));
    }

    /*
1
Написать метод, который возвращает ИНДЕКС максимального элемента в массиве
*/
    public static int getMaxIndex(int[] array) {
        int temp = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {     // находим максиамальное значение в массиве
            if (temp < array[i]) {
                temp = array[i];
            }
        }
        for (j = 0; j < array.length; j++) {       // находим индекс максимального значения в массиве
            if (temp == array[j]) {
                return j;
            }
        }
        return -1;     // тут не уверенна, что именно надо возвращать.
    }

    /*

2
Написать метод, который возвращает ИНДЕКС минимального элемента в массиве
*/
    public static int getMinIndex(int[] array) {
        int i = 0;
        int temp = array[i];
        int j = 0;

        for (i = 0; i < array.length; i++) {     // находим минимальное значение в массиве
            if (temp > array[i]) {
                temp = array[i];
            }
        }
        for (j = 0; j < array.length; j++) {       // находим индекс минимального значения в массиве
            if (temp == array[j]) {
                return j;
            }
        }
        return -1;     // тут не уверенна, что именно надо возвращать.
    }


    /*

3
Написать метод, который создает копию исходного массива и в ней меняяет местами максимальный и минимальный элементы
         */
}