public class Car {
    /*
        Задание 1
Создайте класс Car с полями:
brand;
horsePowers - сколько лошадиных сил;
boolean isElectric; - электрическая ли машина.
Внутри класса создайте конструктор и toString.
*/
    String brand;
    int horsePowers;
    boolean isElectric;

    Car(String brand, int horsePowers, boolean isElectric) {
        this.brand = brand;
        this.horsePowers = horsePowers;
        this.isElectric = isElectric;
    }

    public String toString() {
        if (isElectric) {
            return "Brand: " + brand +
                    " (horse power: " + horsePowers +
                    ", electric)";
        }

        return "Brand: " + brand +
                " (horse power: " + horsePowers +
                ", no electric)";
    }

    /*
    Создайте еще один метод drive.
Метод должен выводить в консоль фразу "Zzzzz", - если машина электрическая,
фразу "Brr-brr-brr", если машина не электрическая.
     */

    public void drive(){
       if (isElectric){
           System.out.println("Zzzzz");
       } else {
           System.out.println("Brr-brr-brr");
       }
    }


}
