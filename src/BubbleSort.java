import static java.lang.System.out;

/**
 * Created by angie on 6/7/17.
 */
public class BubbleSort {
    public static int[] bubbleSortArray(int[] arr) {
//         two nested loops
//         1st is a reverse loops
//         use a tail index to keep track of elements moved to the end
//         outer loop decrements the tail index
//         nested loop iterate from the start to the tail
//         use temp var to do the swap
        int tail = arr.length - 1;
        for (int i = tail; i >= 0; i--) {
            for (int j = 0; j < tail; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            tail--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] testArr = {5, 4, 3};
        int[] newArr = bubbleSortArray(testArr);
        for (int n : newArr) {
            out.println(n);
        }
    }
}
