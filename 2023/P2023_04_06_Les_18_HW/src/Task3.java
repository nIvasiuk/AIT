public class Task3 {
    public static void main(String[] args) {

        System.out.println(getSumOfArraysNumbers(new int[]{1, 2, 3}));
        System.out.println();
        System.out.println(getSumOfNumberDivByThreeAndFive(new int[] {15,9,1,30,5}));
        System.out.println();
        System.out.println(getMaxNumber(new int[] {15,9,1,30,5}));
        System.out.println(getMaxNumber(new int[] {-15,6,1,0,-5}));
    }

    /*
    3
Напишите метод, который принимает массив целых чисел и возвращает сумму всех элементов
{5,9,1} -> 15
     */
    public static int getSumOfArraysNumbers(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res = res + array[i];
        }
        return res;
    }

    /*
    4
Напишите метод , который считает сумму всех элементов из массива целых чисел, которые делятся и на 3 и на 5
{15,9,1,30,5} -> 45 т.е. 15+30
     */

    public static int getSumOfNumberDivByThreeAndFive(int [] array){
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 3 == 0) && (array[i] % 5 == 0)) {
                res = res + array[i];
            } else {
                res = res + 0;
            }
        }
        return res;
    }

    /*
    5
Напишите метод, который возвращает самое большое число из заданного массива целых чисел.
{15,9,1,30,5} -> 30
{-15,6,1,0,-5} -> 6
     */

   public static int getMaxNumber (int [] array){
       int res = array[0];
       for (int i = 0; i < array.length; i++) {
           if (array[i]>=res) {
               res = array[i];
           }
       }
       return res;
   }

}
