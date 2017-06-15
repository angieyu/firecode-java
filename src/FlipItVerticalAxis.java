import static java.lang.System.out;

/**
 * Created by angie on 6/14/17.
 */
public class FlipItVerticalAxis {
    public static void flipItVerticalAxis(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Math.floor(columns / 2); j++) {
                int tempA = matrix[i][j];
                int tempB = matrix[i][columns - 1 - j];
                matrix[i][j] = tempB;
                matrix[i][columns - 1 - j] = tempA;
            }
        }
    }

    public static void main(String[] args) {
        int[][] test = {
                {20, 18, 22, 20, 16},
                {18, 20, 18, 21, 20},
                {16, 18, 16, 20, 24},
                {25, 24, 22, 24, 25},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        flipItVerticalAxis(test);
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
    }
}
