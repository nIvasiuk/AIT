import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
               /*
        Задание 1
Создайте класс Car с полями:
brand;
horsePowers - сколько лошадиных сил;
boolean isElectric; - электрическая ли машина.
Внутри класса создайте конструктор и toString.

Создайте еще один метод drive.
Метод должен выводить в консоль фразу "Zzzzz",- если машина электрическая,
фразу "Brr-brr-brr", если машина не электрическая.

Создайте несколько объектов-машин, вызовите метод drive.
*/

        Car bmw = new Car("BMW", 20, false);
        System.out.println(bmw);
        bmw.drive();

        System.out.println();

        Car mercedes = new Car("Mercedes", 18, true);
        System.out.println(mercedes);
        mercedes.drive();



        /*

Задание 2
Создайте ArrayList стрингов.
Добавьте туда произвольное число слов на ваше усмотрение.
Используя цикл, объедините все элементы в одну большую строку String
(используйте для этого промежуточную переменную "аккумулятор") и выведите получившийся результат в консоль.
Например, для ["Apple", "Orange", "Grape"] должна получится строка "AppleOrangeGrape".
         */

        System.out.println();

        ArrayList <String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Reno");

        String listOfCars = "";

        for (int i = 0; i < cars.size(); i++) {
            listOfCars += cars.get(i)+" ";
        }

        System.out.println(listOfCars);

    }
}