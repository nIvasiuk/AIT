import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площадь квадрата:");
        double areaOfSquare = scanner.nextDouble();

        double sideOfSquare =  Math.sqrt(areaOfSquare);
        System.out.println("Сторона квадрата равна " + Math.ceil(sideOfSquare) + " см.");
    }
}