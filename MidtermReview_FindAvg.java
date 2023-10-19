import java.util.Random;
import java.util.Scanner;

public class MidtermReview_FindAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking the user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Getting the 2D array
        int[][] array = getArray(rows, columns);

        // Printing the 2D array
        printArray(array);

        // Printing the average
        printAverage(array);

        input.close();
    }

    public static int[][] getArray(int rows, int columns) {
        Random random = new Random();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(101); // Random values from 0 to 100
            }
        }

        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printAverage(int[][] array) {
        int total = 0;
        int count = 0;

        for (int[] row : array) {
            for (int element : row) {
                total += element;
                count++;
            }
        }

        double average = (double) total / count;
        System.out.printf("The average is %.2f\n", average);
    }
}
