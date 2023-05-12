public class Main {
    public static void main(String[] args) {

        understand();
    }
        /* Задача 1
Создайте метод, который ничего не принимает в качестве параметров,
выводит в консоль: "Кажется я начинаю понимать".
Назовите этот метод understand. Вызовите метод внутри main.
*/
        public static void understand(){
            System.out.println("Кажется я начинаю понимать");

            System.out.println(powOfThree(3));

            System.out.println(firstToUpper("hypocrisy"));
        }

        /* Задача 2
Создайте метод c именем powOfThree, метод принимает int, возвращает int.
Пусть метод возводит число в третью степень. Вызовите метод в main.
*/
    public static int powOfThree (int number){

        return number * number * number;
    }

/* Задача 3
Создайте метод, который принимает в качестве параметра String - возвращает новый String.
Пусть метод переводит первые три символа в upper case (верхний регистр),
а все остальные символы в lower case (нижний регистр). Назовите метод firstToUpper.
         */

    public static String firstToUpper(String word){
        String wordsFirstPart = word.substring(0,3);
        String wordsSecondPart = word.substring(2);
        String result = wordsFirstPart.toUpperCase()+wordsSecondPart.toLowerCase();
        return result;
    }




}