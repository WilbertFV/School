import java.util.Random;

public class Part6 {

    public static void main(String[] args) {
        // b) Declare and create a 3D array
        int[][][] threeDArray = new int[3][4][2];
        
        // c) Populate the 3D array with random numbers, print content of your array
        Random rand = new Random();
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    threeDArray[i][j][k] = rand.nextInt(50);
                }
            }
        }

        System.out.println("3D Array Content:");
        printThreeDArray(threeDArray);

        // d) Implement a method that accepts the 3D array, finds, and returns an average in it
        double average = findAverage(threeDArray);
        System.out.println("Average: " + average);
    }

    public static void printThreeDArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.printf("%4d", array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static double findAverage(int[][][] array) {
        int totalElements = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    sum += array[i][j][k];
                    totalElements++;
                }
            }
        }

        return (double) sum / totalElements;
    }
}

