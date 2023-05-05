public class Main {
    public static void main(String[] args) {
        String[] words = {"John", "Ann", "Jack", "Ray"};

        changeWords(words);

        // Task 2

        String[] students = {"John", "Ann", "Jack", "Ray", "Mary"};
        int[] skipLessons = {5, 4, 2, 0, 4};

        System.out.println();
        printStudentsWithSomeSkipLessons(students, skipLessons, 2);
        System.out.println();
        printStudentsWithSkipLessons(students, skipLessons);

    }

    /*
    Задание 1
Создайте метод, который принимает массив слов, и заменяет все самые длинные слова на "***".

Например,для массива {"John","Ann", "Jack", "Ray"} вызов метода изменит
массив на {"***","Ann", "***", "Ray"}.
Данный метод должен менять исходный массив.
1) узнать длину самого длинного слова (длинных слов)
 2) Бежать по массиву и менять длинные слова

     */
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int findLongestWord(String[] array) {
        int length = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (length < array[i].length()) {
                length = array[i].length();
            }
        }
        return length;
    }

    public static void changeWords(String[] array) {
        System.out.println("***** array before changes *****");
        printArray(array);
        int length = findLongestWord(array);
        for (int i = 0; i < array.length; i++) {
            if (length == array[i].length()) {
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
то skipLessons[2] содержит количество прогулянных Джеком занятий. Вам нужно реализовать:

метод, который печатает всех студентов, у кого прогулов больше чем заданное число N
метод, который создаст новый массив со строками вида:
"Jack прогулял 5 занятий" для всех студентов, которые прогуливали
"Nick не прогуливал" для всех, кто не прогуливал
     */

    public static void printStudentsWithSomeSkipLessons(String[] students, int[] skipLessons, int number) {
        for (int i = 0; i < skipLessons.length; i++) {
            if (number < skipLessons[i]) {
                System.out.println(students[i] + " " + skipLessons[i]);
            }
        }
    }
    public static void printStudentsWithSkipLessons(String[] students, int[] skipLessons) {
        for (int i = 0; i < skipLessons.length; i++) {
                if (skipLessons[i] > 0) {
                    System.out.println(students[i] + " прогулял " + skipLessons[i] + " занятий");
                } else {
                    System.out.println(students[i] + " не прогуливал");
                }
        }
    }

    public static String[] getStudentsWithSkipLessons(String[] students, int[] skipLessons) {
        String[] newArray = new String[students.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = students[i] + " " + skipLessons[i];
        }
        return newArray;
    }
}