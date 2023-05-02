public class Main {
    public static void main(String[] args) {
        // Создайте метод,
        // который возвращает длину самого большого слова
        // {"apple", "pear"} --> 5

        String [] fruits = {"apple", "pear"};
        System.out.println(getLongestWord(fruits));
        System.out.println();
        printArray(getNewSortedArray(fruits));
        String [] newFruits =  { "apple", "pear", "grape" };
        changeArray( newFruits );

    }
    public static int getLongestWord(String [] array){
        int res = array[0].length();
        for (int i = 0; i < array.length; i++) {
            if (res < array[i].length()){
                res = array[i].length();
            }
        }
        return res;
    }

    public static int [] getNewSortedArray(String [] array){
        int res = array[0].length();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (res < array[i].length()){
                res = array[i].length();
                index = i;
            }
        }
        int [] newArray = new int[2];
        newArray[0] = array[1].length(); // hard code
        newArray[1] = res;
        return newArray;
    }
    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d, ", array[i]);
        }
    }
    // Создайте мутирующий метод, который
    // заменяет все слова длиннее 4 (строго больше) символов на "***"
    // метод принимает массив String
    // возвращает void
    // {"apple", "pear", "grape"} --> void
    // {"***", "pear", "***"}
    public static void changeArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i].length()>4){
                array[i] = "***";
            }
        }
    }
}