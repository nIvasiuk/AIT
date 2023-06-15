public class Main {
    public static void main(String[] args) {
      /*
Представите, что Вы пишите банковское приложение.

1.
а. Создайте класс MyDate со следующими атрибутами (int day, int month, int year).
Напишите метод конструктор и toString .

b. Создайте класс Person со следующими атрибутами String firstName, String lastName, MyDate birtday
 Напишите методы конструктор, toString.

с. Создайте класс Account со следующими атрибутами: String IBAN (номер счета),
Person owner (владелец), double balance (баланс), MyDate dayOpen (дата открытия)

Напишите метод конструктор, toString.

Создайте несколько счетов, создайте массив из счетов, распечатайте список счетов.
*/
        Person markow = new Person( "Mark", "Markow", new MyDate(03,04,1981));
        Person smith = new Person( "John", "Smith", new MyDate(04,12,1995));
        Person peterson = new Person( "Johanna", "Peterson", new MyDate(14,8,2001));

        Account account1 = new Account("0000000001",markow, 100.0, new MyDate(1,2,2020));
        Account account2 = new Account("0000000002",smith, 500.0, new MyDate(2,2,2023));
        Account account3 = new Account("0000000003",peterson, 150.0, new MyDate(15,12,2021));

        Account[] accounts = { account1, account2, account3};

        printArray(accounts);
        incomeAllTransaction(accounts, 1000);
        System.out.println("----- после зачисления на счёт ----");
        printArray(accounts);

        /*
2
В классе Account напишите метод incomeTransaction(double amount) , который увеличивает баланс счета на сумму amount.
В Main напишите метод, который используя метод incomeTransaction, добавляет ко всем счетам из массива 1000.
 */

 /*
        сейчас у тебя счета просто в массиве, а ты добавь еще класс Банк, у которого будет массив клиентов, счетов и капитал

юзеров со счетами наверное стоит вывернуть на изнанку - чтоб у юзера был массив счетов

банк.опенЩет(юзер, сумма)
 - если юзер новый - добавляем в массив юзеров
 - создаем счет с инкрементальным номером (тоже надо в банке хранить последний использованный номер) и сохраняем в массиве счетов
- добавляем счет юзеру
- добавляем сумму в капитал банка

банк.клозьЩеть(юзер, ебан)
- ищем юзера, ищес у него счет и дропаем
- предварительно декрементим капитал на требуемую сумму (тут кстати еще и эксепшн пригодится)
- если у юзера больше нема счетов - удалить юзера

банк.гпдейтЩет(юзер, ебан, сумма) - ну, понятно

еще у банки должен быть поиск счета по ебану без юзера
         */
    }

    public static void printArray(Account[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void incomeAllTransaction(Account[] array, double income){
        for (int i = 0; i < array.length; i++) {
            array[i].incomeTransaction(income);
        }

    }
}