import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchFinder extends AbstractFinder{

public BinarySearchFinder(int[] elements){
    super(null);
    int[] newElements = Arrays.copyOf(elements, elements.length);
    this.elements = newElements;
    Arrays.sort(this.elements);
}
    @Override
    public boolean find(int element) {

        int left = 0;
        int right = elements.length - 1;
        int middle = left + (right - left) /2;
        while (left <= right) {
            if (element < elements[middle]) {
                right = middle - 1;
            } else if (element > elements[middle]) {
                left = middle + 1;
            } else {
                return true;
            }

            middle = left + (right - left) / 2;

        }
        return false;
    }
}
