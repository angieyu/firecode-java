/**
 * Created by angie on 6/22/17.
 */
public class MaxGain {

    public static int maxGain(int[] a) {
        int min = a[0];
        int maxDiff = a[0] - min;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            int diff = a[i] - min;
            if (diff > maxDiff) maxDiff = diff;
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] test = {100, 40, 20, 10};
        java.lang.System.out.println(maxGain(test));
    }
}
