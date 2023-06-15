public class Main {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 10, -7, 8};
        AbstractFinder finder = new BinarySearchFinder(array);
        System.out.println(finder.find(10));
        System.out.println(finder.find(100));

    }
}