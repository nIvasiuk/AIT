public class Main {
    public static void main(String[] args) {
        /*
        Задание 1
Создайте массив char со следующими элементами: .
Выведите элементы в консоль в обратном порядке. (Внимание! В обратном порядке - это от последнего элемента к первому )
         */
        char [] letters = {'j', 'l', 'k', 't', 'y', 'u'};
        for (int i = letters.length-1; i < letters.length && i >=0; i--){
            System.out.println(letters[i]);
        }
        /*
        Задание 2
Создайте массив из следующих элементов: "Dog", "Cat", "Monkey", "Snake".
Поменяйте местами значения между ячейкой под индексом 1 и ячейкой под индексом 3.
         */
        System.out.println("********** TASK 2 **********");


        String [] animals = {"Dog", "Cat", "Monkey", "Snake"};
        String temp = animals[1];
        animals[1] = animals[3];
        animals[3] = temp;

        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
    /*
Задание 3 *
Создайте массив чисел от 1 до 97. После создания выведите все элементы массива в консоль.
     */
        System.out.println("********** TASK 3 **********");

        int [] numbers = new int[97];
        int j = 0;
        for (int i = 1; i <= 97; i++){
            numbers[0] = j++;
            System.out.printf("index %d, number %d \n", i, j);
        }

    }
}