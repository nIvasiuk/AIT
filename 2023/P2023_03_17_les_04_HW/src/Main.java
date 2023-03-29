import java.util.Scanner;

/*Задача 1
Создайте сканер и получите от пользователя его имя, вес (double), возраст, пол, количество детей, месячный доход.

Выведите информацию в консоль в следующем формате:

"Иван Иванов, 37 лет. Пол: мужской. Количество детей: 2. Годовой доход: 55000 евро"

Обратите внимание, что выводится годовой доход, а не месячный.

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tape your first and last name:");
        String name = scanner.nextLine();

        System.out.println("Type your weight:");
        double weight = scanner.nextDouble();

        System.out.println("Type your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // фикс - чтобы не съедалась строка
        System.out.println("Type your sex: ");
        String sex = scanner.nextLine();

        System.out.println("Type number of your kids: ");
        int numberOfKids = scanner.nextInt();

        System.out.println("Type your monthly income: ");
        double monthlyIncome = scanner.nextDouble();
        int annualIncome = (int) Math.ceil(monthlyIncome * 12);

        //"Иван Иванов, 37 лет. Пол: мужской. Количество детей: 2. Годовой доход: 55000 евро"
        System.out.println("\"" + name + ", " + age + " лет. Пол: " + sex +
                ". Количество детей: " + numberOfKids +
                ". Годовой доход: " + annualIncome + " евро\"");
    }
}