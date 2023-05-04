public class Main {
    public static void main(String[] args) {
        String [] words = {"John","Ann", "Jack", "Ray"};

        changeWords(words);

    }

    /*
    Задание 1
Создайте метод, который принимает массив слов, и заменяет все самые длинные слова на "***".

Например,для массива {"John","Ann", "Jack", "Ray"} вызов метода изменит
массив на {"***","Ann", "***", "Ray"}.
Данный метод должен менять исходный массив.
1) узнать длинну самого длинного слова (длинных слов)
 2) Бежать по массиву и менять длинные слова

     */
public static void printArray (String[] array){
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}
    public static int findLongestWord (String[] array){
        int length = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (length < array[i].length()){
                length = array[i].length();
            }

        }
        return length;
    }

    public static void changeWords(String[] array){
        System.out.println("***** array before changes *****");
        printArray(array);
        int length = findLongestWord(array);
        for (int i = 0; i < array.length; i++) {

            if (length == array[i].length()){
                array[i] = "***";
            }
        }
        System.out.println("***** array after changes *****");
        printArray(array);
    }

    /*
    Задание 2 *
Дано два массива, массив с именами студентов String[] students второй массив int[] skipLessons,
в котором указано сколько занятий пропустил соответствующий студент. Т.е. если в первом массиве students[2]="jack",
то skipLessons[2] содержжит количество прогуленных Джжеком занятий. Вам нужно реализовать:

метод, который печатает всех студентов, у кого прогулов больше чем заданное число N
метод, который создаст новый массив со строками вида:
"Jack прогулял 5 занятий" для всех студентов, которые прогулмвали
"Nick не прогуливал" для всех, кто не прогуливал
     */
}