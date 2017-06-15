import java.util.Arrays;
import java.util.TreeSet;

import static java.lang.System.out;

/**
 * Created by angie on 6/10/17.
 */
public class RepeatedElementsInAnArray {
    public static String duplicate(int[] numbers) {
        // find repeated or duplicate elements in an array
        // return a list of repeated integers in a string with the elements sorted in ascending order
        TreeSet<Integer> myCache = new TreeSet<Integer>();
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                myCache.add(numbers[i]);
            }
        }
        out.println(myCache);
        return myCache.toString();
    }

    public static void main(String[] args) {
        int[] testArr = {1, 1, 2, 2, 3, 4, 5, 5};
        duplicate(testArr);
    }
}
