public class Main {
    public static void main(String[] args) {

       /*
       Task 14
Явно проинициализировать массив из 10-ти элементов, таким образом, чтобы в нем был только один максимальный и один минимальный элемент.

Поменять местами максимальный и минимальные элементы.

Вывести полученный массив в консоль.
        */

        int [] numbers = new int[] {2, 8, 15, 7, 19, 10, 4, 50, 90,  99};
        int indexOfMaxNumber = findIndexOfMaxNumber(numbers);
        int indexOfMinNumber = findIndexOfMinNumber(numbers);

        System.out.println(indexOfMaxNumber);
        System.out.println(indexOfMinNumber);

      printArray(numbers);


      System.out.println();
      swapMaxAndMinElement(numbers, indexOfMaxNumber, indexOfMinNumber);
      printArray(numbers);

    }

    public static int findIndexOfMaxNumber ( int [] array){
        int max = array[0];
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]){
                max = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public static int findIndexOfMinNumber(int [] array){
        int min = array[0];
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]){
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    public static void printArray (int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

   public static void swapMaxAndMinElement (int [] array, int indexOfMax, int indexOfMin){
    int temp = array[indexOfMin];
    array[indexOfMin] = array[indexOfMax];
    array[indexOfMax] = temp;
   }

}