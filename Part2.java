import java.util.Random;

public class Part2 {

    public static void main(String[] args) {
        // Step b) Declaration and Creation of Matrix
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        System.out.println("Matrix Dimensions: " + rows + " rows, " + cols + " columns");
        
        // Step c) Populating Matrix with Random Numbers and Printing
        Random rand = new Random();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(100);  // Populate matrix with random numbers between 0 and 99
            }
        }
        System.out.println("Matrix Content:");
        printMatrix(matrix);
        
        // Step d) Creating a Ragged/Jagged Array and Printing
        int[][] jaggedArray = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };
        System.out.println("Jagged Array Content:");
        printMatrix(jaggedArray);
    }

    // Method to Print Matrix Content
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
