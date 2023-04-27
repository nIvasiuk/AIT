public class Main {
    public static void main(String[] args) {

        int [] array = {1, 8, 4};
        System.out.println("-------- Task 1 -------");
        System.out.println(getMaxIndex(array));
    }
    /*
1
Написать метод, который возвращает ИНДЕКС максимального элемента в массиве
*/
    public static int getMaxIndex(int [] array){
        int temp = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (temp < array[i]){
                temp = array[i];
            }
        }
        for ( j = 0; j < array.length; j++) {
            if (temp == array[j]){
                return j;
            }
        }
        return j;
    }
    /*

2
Написать метод, который возвращает ИНДЕКС минимального элеиента в массиве
*/



    /*

3
Написать метод, который создает копию исходного массива и в ней меняяет местами максимальный и минимальный элементы
         */
}