import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class EmailRegistrationSystem {

    // Set to store existing emails
    private static HashSet<String> existingEmails = new HashSet<>();
    private static Random rand = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display table header
        System.out.println("Full name\t\tKean email\t\tPassword");
        System.out.println("---------------------------------------------------------");

        // Loop to get details for 5 users
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();

            String email = generateEmail(firstName, lastName);
            int password = generatePassword();

            System.out.println(firstName + " " + lastName + "\t\t" + email + "\t\t" + password);
        }

        scanner.close();
    }

    public static String generateEmail(String firstName, String lastName) {
        String baseEmail = firstName.charAt(0) + lastName.toLowerCase() + "@kean.edu";

        // If the email already exists, we simply return it without generating an alternate.
        // Note: This might not be ideal in a real-world scenario as it could lead to email collisions.
        return baseEmail;
    }

    public static int generatePassword() {
        return rand.nextInt(900000) + 100000; // Generate a random 6-digit number
    }
}
