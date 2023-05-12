public class Main {
    public static void main(String[] args) {
        // cut
        // метод принимает String
        // метод возвращает новый String
        // он оставляет только первые 4 буквы от слова и добавляет многоточие "..."
        // "Аквариум" --> [метод] --> "Аква..."
        System.out.println(cut("Аквариум"));

    }

    public static String cut(String word) {
        String newWordLeft = word.substring(0, 4);
        String newWord = newWordLeft + "...";
        return newWord;
    }
}