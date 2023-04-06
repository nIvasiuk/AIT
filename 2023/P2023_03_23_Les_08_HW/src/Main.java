public class Main {
    public static void main(String[] args) {

        /*Задание 1
Есть прибор у которого есть 2 колбы. В программе дано две переменных,
которые содержат температуру каждой колбы (начение для этих переменных можно задат со Scanner,
 можно просто присвоить значение в программе ).
Считается, что прибор работает корректно если разница температуры между
кобами не более 10 градусов и в одной из колб (в любой из двух) температура больше 70 градусов.
Если хотите, можно немного упростить:
считать, что температура в первой колбе всегда больше, чем температура во второй

         */
         int tempColbaOne = 66;
         int tempColbaTwo = 65;
         int differenceTemp = tempColbaOne - tempColbaTwo;
         boolean isCoeerct = true;

         if (differenceTemp < 10 & differenceTemp > -10 ) {
             if (tempColbaOne > 70 | tempColbaTwo > 70){
                 isCoeerct = true;
             }else {
                 isCoeerct = false;
             }
         } else {
             isCoeerct = false;
         }

        System.out.println("result - " + isCoeerct);
    }
}