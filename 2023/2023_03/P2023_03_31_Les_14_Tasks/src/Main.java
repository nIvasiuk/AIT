public class Main {
    public static void main(String[] args) {
        // 70 to 136
        // -75 to -98

        int i = 70;
        while (i <= 136) {
            System.out.println(i);
            i++;
        }

        int j = -75;
        while (j >= -98) {
            System.out.println(j);
            j--;
        }

        System.out.println("****** 3 ******");
        // Выводить в консоль цифры от одного до ста
        // если число кратно 3-м (делится на три без остатка)
        // то мы выводим еще слово "бинго"
        // Пример
        // 1       *
        // 2
        // 3 бинго
        // 4       *
        // 5
        // 6 бинго
        // 7       *
        // 8
        // ...
        // 99 бинго
        // 100

        int n = 1;
        while (n <= 100) {
            if (n % 3 != 0) {
                System.out.println(n);
            } else {
                System.out.println(n + " Bingo");
            }
            n++;
        }
    }
}