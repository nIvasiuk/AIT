public class Main {
    public static void main(String[] args) {
        System.out.println(isTwoEqualsThird(1,2,3)); // true
        System.out.println(isTwoEqualsThird(1,1,3)); // false
        System.out.println(isTwoEqualsThird(17,0,17));  // true

        System.out.println("----------Task 2 ------------");
        System.out.println(isTwoEqualsThird2(12,15,7));
        System.out.println(isTwoEqualsThird2(8,15,7));

        System.out.println("----------Task 3 ------------");
        System.out.println(getLengthOfString("Напишите метод", "Напишите метод, который получает три целых числа и возвращает true,"));

    }
    /* Задача 1
Напишитте метод, который получает три целых числа и возвращает true,
первое и второе число в сумме дают третье числу, иначе false.
*/
    public static boolean isTwoEqualsThird(int firstNumber, int secondNumber, int thirdNumber){
        return  (firstNumber+secondNumber == thirdNumber);
    }
        /*
Задача 2
Напишите метод, который получает три целых числа и возвращает true,
если среди этих чисел есть такое, которое равно сумме двух оставшихся чисел.
Например:
(12,15,7) -> false;
(8,15,7) -> true;
Подсказка: используйте метод, написанный в задаче 1.
*/
    public static boolean isTwoEqualsThird2(int firstNumber, int secondNumber, int thirdNumber){
        // find max
        //сравнить ?
        int maxNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        int maxNumber2 = (maxNumber > thirdNumber) ?  maxNumber : thirdNumber;

        if (maxNumber2 == ( firstNumber + secondNumber)) {
            return (maxNumber2 == ( firstNumber + secondNumber));
        } else if (maxNumber2 == (firstNumber + thirdNumber)){
            return maxNumber2 == (firstNumber + thirdNumber);
        } else {
        return  maxNumber2 == (secondNumber + thirdNumber);
        }
            } // я не додумалась, как применить сюда первый метод.
        /*
Задача 3
Напишите метод, который получает две строки и возвращает длину строки (т.е. int), которая длиннее.
 */
public static int getLengthOfString(String firstString, String secondString){
    //посчитать длину стр1 и стр2  - int
    //сравнить показатели
    // вернуть ту, что длиннее
    return (firstString.length() > secondString.length()) ? firstString.length() : secondString.length();
}


}