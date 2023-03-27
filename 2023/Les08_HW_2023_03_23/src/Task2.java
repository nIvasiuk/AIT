import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Задание 2

a. Пользователь вводит с клавиатуры IBAN в вде строки (Например так: DE2334923291). Программа проверяет, что счет корректный, т.е.

длина составляет 12 символов
начинается на "DE"
b. Если после DE следует "2334" (это значение должно быть заданно в программе как переменная) программа должна выдать сообщение:
"счет клиента №923291 в нашем банкке" ( №923291 - оставшиеся цифры счета).
Если после DE следует что то другое, то программа должна выдать сообщение "введенный счет из другого филиала"
Например:

DE2334923291 -> счет клиента №923291 в нашем банкке
G2334923291 -> некорректный номер счета
DE23349232916843 -> некорректный номер счета
DE5554923291 -> введенный счет из другого филиала
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите IBAN : ");
        String usersIban = scanner.next();

        boolean lengthOfIban = usersIban.length() == 12; // condition 1

        boolean firstSymbol = usersIban.charAt(0) == 'D'; // condition2
        boolean secondSymbol = usersIban.charAt(1) == 'E';

        boolean beginOfIban = firstSymbol & secondSymbol;

        boolean isCorrectIban = lengthOfIban & beginOfIban;   // check

        if (isCorrectIban){
            System.out.println("Счёт корректный");
        } else {
            System.out.println("Счёт HE корректный");
        }

    }
}
