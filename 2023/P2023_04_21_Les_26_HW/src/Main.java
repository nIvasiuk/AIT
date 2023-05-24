import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     /*
     Задача 1 Напишите метод, который получает массив из строк, а возвращает LinkedList,
     который содержит все строки исходного массива начинающиеся на “при”.
     Например: {“пришел”,“поехал”,“приехал”,“проехал”} --> {“пришел”,“приехал”} Желательно использовать for…each
     */

        String [] words = new String[ ]{"пришел", "поехал", "приехал", "проехал"};
        System.out.println(getStringStartingWithPre(words));


        /*
Задача 2 Напишите метод, который получает `List’, а возвращает LinkedList,
который содержит все строки исходного List’а но в обратном порядке
Например: {“1. Джэк”,“2. Джон”,“3. Ник”} --> {“3. Ник”,“2. Джон”,“1. Джэк”}
*/
        List <String>  listOfNames = List.of("1. Джэк", "2. Джон", "3. Ник");
        System.out.println(listOfNames);
        LinkedList<String> resultListOfNames = reversList(listOfNames);
        System.out.println(resultListOfNames);



/*
Задача 2* (необязательно) выполнить задачу 2 используя for…each
      */

        System.out.println("*********** var 2 *************");
        LinkedList<String> resultListOfNames2 = reversList2(listOfNames);
        System.out.println(resultListOfNames2);

    }

    public static LinkedList <String> getStringStartingWithPre (String [] array ){
        LinkedList <String> newList = new LinkedList<>();
        for (String word : array){   // for ... each
            if (word.length() >= 3 && word.substring(0,3).equalsIgnoreCase("при")){
                newList.add(word);
            }
        }
        return newList;
    }

    public static LinkedList <String> reversList (List <String> list){
        LinkedList <String> newList = new LinkedList<>();

        for (int i = list.size()-1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    public static LinkedList <String> reversList2 (List <String> list){
        LinkedList <String> newList = new LinkedList<>();

        for (String word: list) {
            newList.addFirst(word);
        }
        return newList;
    }

}