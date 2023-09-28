import java.util.Random;

public class Part7 {

    public static void main(String[] args) {
        // a) Create a 4D array with dimensions 2x2x2x2
        int[][][][] fourDArray = new int[2][2][2][2];

        Random rand = new Random();

        // b) Populate it with random numbers, print the array to console
        populateArray(fourDArray, rand);
        System.out.println("4D Array 1 Content:");
        printFourDArray(fourDArray);

        // c) Create and populate a 4D array with dimensions 3x3x3x3
        int[][][][] fourDArray2 = new int[3][3][3][3];
        populateArray(fourDArray2, rand);

        // d) Add 2 to all even numbers, add 1 to all odd numbers in your array
        modifyArray(fourDArray2);

        // e) Print the output
        System.out.println("Updated 4D Array 2 Content:");
        printFourDArray(fourDArray2);
    }

    public static void populateArray(int[][][][] array, Random rand) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        array[i][j][k][l] = rand.nextInt(50);
                    }
                }
            }
        }
    }

    public static void modifyArray(int[][][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        if (array[i][j][k][l] % 2 == 0) {
                            array[i][j][k][l] += 2;
                        } else {
                            array[i][j][k][l] += 1;
                        }
                    }
                }
            }
        }
    }

    public static void printFourDArray(int[][][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.printf("%4d", array[i][j][k][l]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
