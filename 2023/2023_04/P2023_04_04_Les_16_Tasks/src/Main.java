public class Main {
    public static void main(String[] args) {
        print("java");

        getFour("java is very popular");
        System.out.println();
        getFour("012345678");
    }
    /*
    public static void print(String msg){
        for (int i = 0; i < msg.length() ; i++) {
            System.out.println(msg.charAt(i));  // j...  a...  v... a..
        }
    }
    */
    public static void print(String msg){
        int i = 0;
        while (i < msg.length()){
            System.out.println(msg.charAt(i));
            i++;
        }
    }

    /*
            Дана строка. Реализовать метод, который выводит на экран
            только буквы стоящие на четных позициях в этой строке.

            "java is very popular" -> "jv s vr pplr"
            "012345678" -> "02468"
         */
  /*  public static String getFour(String text){
        String result = "";
        for (int i = 0; i < text.length(); i += 2){
            result += text.charAt(i);
        }
        return result;
    }*/

    public static void getFour(String text){
        for (int i = 0; i < text.length(); i += 2){
            System.out.print(text.charAt(i));
        }

    }
}