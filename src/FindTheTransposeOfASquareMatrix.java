/**
 * Created by angie on 6/22/17.
 */
public class FindTheTransposeOfASquareMatrix {
    public static void transposeMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int x = 0; x < N; x++) {
            for (int y = x; y < N; y++) {
                int temp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // test data
        int[][] test = {
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4}
        };
        int[][] test2 = {{1, 0}, {0, 0}};
        transposeMatrix(test);
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
    }
}
