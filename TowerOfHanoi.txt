import java.util.Scanner;

public class TowerOfHanoi {
    private static int moveCount = 0; // Counter for the number of moves

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        long startTime = System.nanoTime(); // Start timing
        System.out.println("The moves are:");
        moveDisks(n, 'A', 'B', 'C');
        long endTime = System.nanoTime(); // End timing

        System.out.println("Number of moves: " + moveCount);
        System.out.println("Time taken (nanoseconds): " + (endTime - startTime));
    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) { // Stopping condition
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveCount++; // Increment move count
        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveCount++; // Increment move count
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
