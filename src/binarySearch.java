import java.util.Arrays;

import static java.lang.System.out;
import static java.util.Arrays.*;

/**
 * Created by angie on 6/7/17.
 */
public class binarySearch {
    public static Boolean binarySearch(int[] arr, int n) {
        if (arr.length == 0) {
            return false;
        }
        int midIndex = (int) Math.ceil(arr.length / 2);
        int mid = arr[midIndex];
        int[] start = Arrays.copyOfRange(arr, 0, midIndex);
        int[] end = Arrays.copyOfRange(arr, midIndex + 1, arr.length);
        if (n == mid) return true;
        else if (mid > n) return binarySearch(start, n);
        else if (mid < n) return binarySearch(end, n);
        return false;
    }

    public static void main(String[] args) {
        int[] testArr = {2, 5, 7, 9, 12};
        boolean result = binarySearch(testArr, 2);
        out.println(result);
    }
}
