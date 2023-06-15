import java.util.Random;

public class Main {
    public static void main(String[] args) {
       /*
       Task15
Сгенерировать случайный масссив размености 10.
Вывести данный массив в консоль.
Для данного массива вывести количество локальных минимумов.
Локальным минимумом называется число, для которого выполняется условие:
левый сосед > элемент < правый сосед
Например, для массива 4, 5, 2, 10, 15, 14, 20 локальныйми минимумами будут числа:
4, 2, 14
Следовательно, для данного массива программа должна вывести число 3.

Task15Star
Для задачи Task15 сделать вывод количества локальных минимумов и сами минимумы:

3
4, 2, 14
        */
       Random random = new Random();
       int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


        int counter = 0;
        for (int i = 1; i < numbers.length-1; i++) {

            if (numbers[i] < numbers[i-1]  && numbers[i] < numbers[i+1]){
                counter++;
              //  System.out.println(numbers[i]);
            }
            
        }
        System.out.println();
        System.out.println(counter);
    }


}