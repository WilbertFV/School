import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class KeanEmailGenerator {

    // We need to store the emails so we can check them.
    private static HashSet<String> existingEmails = new HashSet<>();
    private static Random rand = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to get details for 5 users
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();

            String email = generateEmail(firstName, lastName);
            int password = generatePassword();

            // Display the table header
            System.out.println("\n"+ "Full Name            Kean email            Password");
            
            // Display the results in the desired format
            System.out.printf("%-20s %-20s  %-20d\n", firstName + " " + lastName, email, password);
        }

        scanner.close();
    }

    private static String generateEmail(String firstName, String lastName) {
        String baseEmail = firstName.charAt(0) + lastName.toLowerCase() + "@kean.edu";

        if (existingEmails.contains(baseEmail)) {
            for (int i = 2; i <= 9; i++) {
                String alternateEmail = generateEmail(firstName, lastName, i);
                if (!existingEmails.contains(alternateEmail)) {
                    existingEmails.add(alternateEmail);
                    return alternateEmail;
                }
            }
        }

        existingEmails.add(baseEmail);
        return baseEmail;
    }

    private static String generateEmail(String firstName, String lastName, int num) {
        return firstName.charAt(0) + lastName.toLowerCase() + num + "@kean.edu";
    }

    private static int generatePassword() {
        return rand.nextInt(900000) + 100000; // Generate a random 6-digit number
    }
}
