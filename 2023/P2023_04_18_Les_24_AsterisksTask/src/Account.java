public class Account {
    /*
    с. Создайте класс Account со следующими атрибутами: String IBAN (номер счета),
Person owner (владелец), double balance (баланс), MyDate dayOpen (дата открытия)

Напишите метод конструктор, toString.

2.В классе Account напишите метод incomeTransaction(double amount) , который увеличивает баланс счета на сумму amount.
     */

    String IBAN;
    Person owner;
    double balance;
    MyDate dayOpen;

    Account(String IBAN, Person owner, double balance, MyDate dayOpen){
        this.IBAN = IBAN;
        this.owner = owner;
        this.balance = balance;
        this.dayOpen = dayOpen;
    }

    public String toString(){
        return IBAN + " " + owner + ", " + balance + " (" + dayOpen + ") ";
    }

    public double incomeTransaction(double amount){

        return balance += amount;
    }
}
