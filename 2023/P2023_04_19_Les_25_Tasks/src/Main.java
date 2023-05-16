public class Main {
    public static void main(String[] args) {

       /*
       Создайте класс пират Pirate со следующими полями:
            name;
            nickName;
            boolean isDrunk;
         Создать конструктор и toString
         Создать в классе Pirate метод say
         метод должен выводить в консоль
         "It is a bad day" - если пират трезв
         "Yohohoho, what a good life" - если пират пьян
         Создайте несколько пиратов, вызовите метод say

         *** сделайте метод drink
         метод должен менять знaчение поля isDrunk на true
        */

        Pirate silver = new Pirate("John", "Silver", false);
        System.out.println(silver);
        silver.say();
        System.out.println("**** pirate takes Rom ****");
        silver.drink();
        silver.say();

        System.out.println();
        Pirate sparrow = new Pirate("Jack", "Sparrow", true);
        System.out.println(sparrow);
        sparrow.say();



    }



}