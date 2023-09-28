public class Part3 {

    public static void main(String[] args) {
        // a) Declare, Create, and Initialize a 2D array
        int[][] matrix = {
            {10, 15, 20, 25},
            {30, 35, 40, 45},
            {50, 55, 60, 65}
        };

        // b) Print the values in the form of a table/matrix
        System.out.println("Matrix Content:");
        printMatrix(matrix);

        // c) Print content of odd columns only in the form of a table/matrix
        System.out.println("Odd Columns Content:");
        printOddColumns(matrix);

        // d) Find a maximum element considering only odd columns
        int maxInOddColumns = findMaxInOddColumns(matrix);
        System.out.println("Maximum element in odd columns: " + maxInOddColumns);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    public static void printOddColumns(int[][] matrix) {
        for (int[] row : matrix) {
            for (int j = 1; j < row.length; j += 2) {
                System.out.printf("%4d", row[j]);
            }
            System.out.println();
        }
    }

    public static int findMaxInOddColumns(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int j = 1; j < row.length; j += 2) {
                if (row[j] > max) {
                    max = row[j];
                }
            }
        }
        return max;
    }
}
