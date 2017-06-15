import static java.lang.System.out;

/**
 * Created by angie on 6/14/17.
 */
public class FindMissingNumberInASetOfNumbers {
    public static int findMissingNumber(int[] arr) {
        int[] defaultArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int defaultSum = 0;
        int diff;
        for (int n : defaultArr) {
            defaultSum += n;
        }
        for (int n : arr) {
            sum += n;
        }
        diff = defaultSum - sum;
        return diff;
    }

    public static void main(String[] args) {
        int[] testArr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        out.print(findMissingNumber(testArr));
    }
}
