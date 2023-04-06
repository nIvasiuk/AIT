import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            /*Задание 1

    Утро субботы, вчера у нас был корпоратив. На завтрак нужно приготовить бутерброд.

    Пусть программа спрашивает, что вы хотите положить для каждого из 4 ингредиентов?
    "Что вы положите вниз?"
    "Что дальше?" и т.д.

    Из ингредиентов у нас есть:

    хлеб - bread,
    помидор- tomato,
    ветчина - hum.
    сыр - cheese
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы положите вниз бутерброда?");
        String firstLayer = scanner.nextLine();
        System.out.println("Что вы положите вторым слоем?");
        String secondLayer = scanner.nextLine();
        System.out.println("Что вы положите третьим слоем?");
        String thirdLayer = scanner.nextLine();
        System.out.println("Что вы положите четвертым слоем?");
        String fourthLayer = scanner.nextLine();

              /*
    Если вниз бутерброда положили что-нибудь кроме хлеба - программа выведет в консоль одну фразу:
    "Какой необычный бутерброд". Если ветчина будет сверху сыра - программа выведет:
    "Идеальный бутерброд", в противном случае: "Вкусный бутерброд".
    */
        boolean isFirstLay = true;
        if (isFirstLay != firstLayer.equals("bread")){
            System.out.println("Какой необычный бутерброд");
        } else if ((secondLayer.equals("cheese") && thirdLayer.equals("hum"))
                || (thirdLayer.equals("cheese") && fourthLayer.equals("hum"))
                || (secondLayer.equals("cheese") && fourthLayer.equals("hum")) ) {
            System.out.println("Идеальный бутерброд");
        } else {
            System.out.println("Вкусный бутерброд");
        }

        /*
    Примеры:
    для вводов: cheese, bread, tomato, hum -> "Какой необычный бутерброд"
    для вводов: bread, cheese, tomato, hum -> "Идеальный бутерброд"
    для вводов: bread, tomato, cheese, hum -> "Идеальный бутерброд"
    для вводов: bread, hum, cheese, tomato, -> "Вкусный бутерброд"
    для вводов: bread, tomato, tomato, tomato, -> "Вкусный бутерброд"
    для вводов: bread, tomato, hum, hum, -> "Вкусный бутерброд" и т.д.
         */
    }
}