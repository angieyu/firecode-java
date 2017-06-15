/**
 * Created by angie on 6/2/17.
 */
public class FlipHorizontalAxis {
    public static void flipHorizontalAxis(int[][] matrix) {
        // get the number of rows
        int n = matrix.length;
//        System.out.println(n);
        // iterate through the number of rows divided by two
        for (int i = 0; i < Math.ceil(((double) n) / 2); i++) {
            // create temp variables
            int[] temp1 = matrix[i];
            int[] temp2 = matrix[n - i - 1];
            // switch elements
            matrix[i] = temp2;
            matrix[n - i - 1] = temp1;
        }
    }

    public static void main(String[] args) {
        // test data
        int[][] test = {
                {20, 18, 22, 20, 16},
                {18, 20, 18, 21, 20},
                {16, 18, 16, 20, 24},
                {25, 24, 22, 24, 25},
                {0, 0, 0, 0},
                {1, 1, 1, 1}
        };

        flipHorizontalAxis(test);
        // use the code below to print out matrix
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }

    }
}
