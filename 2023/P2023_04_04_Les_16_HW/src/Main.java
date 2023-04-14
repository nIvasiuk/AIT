public class Main {
    public static void main(String[] args) {

        System.out.println("----------- Task 1 ------------------");
        System.out.println(indexOf("Java is the best", 'i'));
        System.out.println(indexOf("Java is the best", 'q'));
        System.out.println(indexOf("Java is the best", 'a'));

        System.out.println();
        System.out.println("----------- Task 2 ------------------");
        System.out.println(substring("Java is the best", 0, 4));
        System.out.println(substring("Java is the best", 1, 6));
        System.out.println(substring("Java is the best", 1, 60));
        System.out.println(substring("Java is the best", 8, 8));
        System.out.println(substring("Java is the best", 5, 8));
        System.out.println(substring("Java is the best", -1, 8));
    }
        /*
    Задание 1
Напишите метод indexOf, который возвращает индекс заданного символа в заданной строке.
Т.е. метод принимает строку и char и возвращает позиуию, где этот символ первый раз встречается в строке.
Если в заданной строке нет заданного символа, то метод должен вернуть -1.
Примеры: indexOf("Java is the best", 'i') -> 5
indexOf("Java is the best", 'q') -> -1
indexOf("Java is the best", 'a') -> 1
Естественно, в рамках этой задачи нельзя использовать стандартный indexOf класса String
*/

    public static int indexOf(String text, char symbol) {
        int symbolsPosition = -1;
        for (int i = 0; i < text.length(); i++) {    // перебираем по символам
            if (text.charAt(i) == symbol) {
                return i;
            }
        }
        return symbolsPosition;
    }

    /*
    Задание 2
Реализовать свой метод substring(). Т.е в метод приходит строка и два целых числа index1 и index2.
Метод возвращает подстроку, начиная с символа в позиции index1 до символа в позиции index2.
Причем символ в позиции index1 включаем в результат а символ в позиции index2 не включаем.
Если даны "ошибочные параметры", например index2<=index1 или один из индексов не попадает в строку,
 метод должен возвращать пустую строку
  Примеры:
substring("Java is the best", 0, 4) -> "Java"
substring("Java is the best", 1, 6) -> "ava is"
substring("Java is the best", 1, 60) -> ""
substring("Java is the best", 8, 8) -> ""
Естественно, в рамках этой задачи нельзя использовать стандартный substring класса String
     */

    public static String substring(String text, int index1, int index2) {
        String res = "";

        // сперва проверяем

        if (index2 <= index1 || index1 < 0 || index2 >= text.length()) {
            return res;
        } else {


            // перебираем строку

            for (int i = index1; (i < text.length()) && (i < index2); i++) {


                res += text.charAt(i);
            }
        }
        return res;
    }

}