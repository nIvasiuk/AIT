public class Main {
    public static void main(String[] args) {
        System.out.println(findLastSymbolInWord("meet"));
        System.out.println();

        String[] drinks = new String[]{"milk", "vine", "beer"};
        findCharAndReplace(drinks, 'r');
        System.out.println();
        try {
            System.out.println(getElementFromArray(drinks, 0));
            System.out.println();
            System.out.println(getElementFromArray(drinks, -1));
            System.out.println();
            //  System.out.println(getElementFromArray(drinks, 3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
            /*
        Задание 1
Создайте метод, который принимает массив слов и char symbol, и заменяет все слова оканчивающиеся на этот символ на слово bingo.


1.проверить слова на содержание этого символа.
2.если содержит - менять слово.
*/

    public static void findCharAndReplace(String[] words, char symbol) {
        for (int i = 0; i < words.length; i++) {
            char temp = findLastSymbolInWord(words[i]);
            if (symbol == temp) {
                words[i] = "bingo";
            }
            System.out.println(words[i]);
        }
    }

    public static char findLastSymbolInWord(String word) {
        char lastSymbol = 0;
        lastSymbol = word.charAt(word.length() - 1);
        return lastSymbol;
    }
        /*
Задание 2
Создайте метод, который принимает массив и число - возвращает элемент массива по этому числу (номеру).
Пусть метод выбрасывает ошибку, если число меньше нуля или больше длины массива - 1.
Добавьте сообщение в ошибку, вызовите метод в main.

         */

    public static String getElementFromArray(String[] array, int numberOfElement) throws Exception {
        String res = "";
        if (numberOfElement < 0 || numberOfElement > array.length - 1) {
            throw new Exception("число меньше нуля или больше длины массива - 1");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == numberOfElement) {
                    res = array[i];
                }
            }
        }
        return res;
    }
}