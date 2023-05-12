public class Main {
    public static void main(String[] args) {
       /*
       Задание 1
Создайте класс велосипед - Bicycle - с полями:

brand
numberOfSpeeds - количество передач
price - цена
Создайте в main несколько объектов класса велосипед. После создания: увеличьте стоимость первого велосипеда на 30%
*/
     Bicycle ukraine = new Bicycle("Ukraine", 4, 200.99);
     Bicycle rapid = new Bicycle("Rapid", 3, 350.89);
     Bicycle omega = new Bicycle("Omega", 5, 549.99);
     ukraine.price = ukraine.price * 1.3;
        System.out.printf("price %.2f", ukraine.price);

        /*
        Задание 2 *
Создайте массив из трех объектов класса велосипед.
        */

        Bicycle[] bicycles = {ukraine, rapid, omega};
    }
}