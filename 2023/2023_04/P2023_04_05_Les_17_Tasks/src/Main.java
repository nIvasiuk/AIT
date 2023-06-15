public class Main {
    public static void main(String[] args) {

        String [] fruits = {"Orange", "Apple", "Banana", "Grapefruit"};
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        fruits [2] = "Mango";
        System.out.println();
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println("------- Task 2 -------");
        char [] chsrs = {'f', 'g', 'h', 'j', 'k'};
        for (int i = 0; i < chsrs.length; i++){
            System.out.println(chsrs [i]);
        }
        char temp = chsrs [0];
        chsrs [0] = chsrs [4];
        chsrs [4] = temp;
        System.out.println("------- -------");
        for (int i = 0; i < chsrs.length; i++){
            System.out.println(chsrs [i]);
        }


    }
}