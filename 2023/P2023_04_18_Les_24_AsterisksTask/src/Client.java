public class Client {
    /*
    юзеров со счетами наверное стоит вывернуть на изнанку - чтоб у юзера был массив счетов
     */
    Person person;
    Account[] accounts;
    int codeOfClient;

    Client(Person person, int codeOfClient){
        this.person = person;
        this.codeOfClient = codeOfClient;
    }
    public String toString(){
        return "Client: " + person +
                ". Clients code: " + codeOfClient + "\n" +
                "Accounts: " + accounts;
    }
}
