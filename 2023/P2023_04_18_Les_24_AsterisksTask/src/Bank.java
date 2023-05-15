public class Bank {
    /*
    сейчас у тебя счета просто в массиве, а ты добавь еще класс Банк, у которого будет массив клиентов, счетов и капитал
     */
    String name;
    String address;
    int codeOfBank;
    MyDate dayOfOpen;
    Person[] clients;
    Account[] accounts;
    double capital;

    Bank(String name, String address, int codeOfBank, MyDate dayOfOpen, double capital){
        this.name = name;
        this.address =address;
        this.codeOfBank = codeOfBank;
        this.dayOfOpen = dayOfOpen;
        this.capital = capital;
    }

}
