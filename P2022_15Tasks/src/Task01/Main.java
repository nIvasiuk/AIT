package Task01;

/*1.      Написать метод, который принимает параметр типа int и
возвращает третью степень этого числа.

 */
public class Main {
    public static void main(String[] args){


        System.out.println(calculate(2));
        System.out.println(calculate(3));
        System.out.println(calculate(1));

    }

    public static int calculate (int a){
        int result;
        result = a*a*a;
        return result;
    }
}
