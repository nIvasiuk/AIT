import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
        // У нас три раунда напитков -
        // В меню три позиции: "wine", "beer", "vodka"
        // Официант спрашивает у человека три раза, что тот будет пить.
        // Выберите первый напиток, и т.д.
        // a.
        // Если выпили водку хотя бы в одном из раундов:
        // - то выводим в консоль фразу: "Не стоило этого делать, не помню,
        // что произошло дальше"
        // b.
        // Если пили пиво после вина - то нужно вывести фразу:
        // "Ох, не стоило понижать градус"
        // В противном случае вывести фразу:
        // "Какой прекрасной была вечеринка"
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Что будете пить на раунде 1?");
        String drinkOne = scanner.nextLine();
        System.out.println("Что будете пить на раунде 2?");
        String drinkTwo = scanner.nextLine();
        System.out.println("Что будете пить на раунде 3?");
        String drinkTree = scanner.nextLine();

        if (drinkOne.equals("vodka") || drinkTwo.equals("vodka") || drinkTree.equals("vodka")){
            System.out.println("Не стоило этого делать, не помню, что произошло дальше");
        } else if ((drinkOne.equals("wine") && drinkTwo.equals("beer")) ||  (drinkOne.equals("wine") && drinkTwo.equals("beer"))
                || (drinkOne.equals("wine") && drinkTree.equals("beer"))  ){
            System.out.println("Ох, не стоило понижать градус");
        } else {
            System.out.println("Какой прекрасной была вечеринка");
        }
    }
}