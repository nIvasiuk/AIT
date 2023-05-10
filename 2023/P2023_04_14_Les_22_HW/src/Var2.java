public class Var2 {
    public static void main(String[] args) {
        String [] drinks = new String[]{"milk", "vine", "beer"};
        printArray(drinks);
        findCharAndReplace(drinks, 'e');
        System.out.println();
        printArray(drinks);
        System.out.println();
        try {
            System.out.println(getElementFromArray(drinks, 0));
            System.out.println();
            System.out.println(getElementFromArray(drinks, -1));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
            /*
        Задание 1
Создайте метод, который принимает массив слов и char symbol, и заменяет все слова оканчивающиеся на этот символ на слово bingo.

1.проверить слова на содержание этого символа.
2.если содержит - менять слово.
*/

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static String [] findCharAndReplace(String[] words, char symbol) {
        for (int i = 0; i < words.length; i++) {
            if (isWordEndsByChar(words[i], symbol)) {
                words[i] = "bingo";
            }
        }
        return words;
    }
    public static boolean isWordEndsByChar(String word, char symbol) {  // делаем проверку отдельным методом

        return word.charAt(word.length() - 1) == symbol;
    }
        /*
Задание 2
Создайте метод, который принимает массив и число - возвращает элемент массива по этому числу (номеру).
Пусть метод выбрасывает ошибку, если число меньше нуля или больше длины массива - 1.
Добавьте сообщение в ошибку, вызовите метод в main.

         */

    public static String getElementFromArray(String[] array, int numberOfElement) throws Exception {
        if (numberOfElement < 0 || numberOfElement > array.length-1){
            throw new Exception("число меньше нуля или больше длины массива - 1");
        }
        return array[numberOfElement];
    }
}
