// Andrew Thigpen | COP 3330C-31034 | June 28, 2026
// Program: "Create Your Account" simulation that collects and validates usernames/passwords.
// Input: Usernames and passwords entered by the user from the keyboard.
// Output: Error messages when a rule is broken, and a final list of all 4 valid accounts.

import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array to hold 4 validated PasswordVerify objects
        PasswordVerify[] accounts = new PasswordVerify[4];
        int count = 0; // tracks how many valid accounts we have so far

        // keep looping until we have 4 valid accounts
        while (count < 4) {
            // display rules before each prompt
            System.out.println("\n--- Create Your Account (" + (count + 1) + " of 4) ---");
            System.out.println("Username rules:");
            System.out.println("  1. Must be at least 6 characters long");
            System.out.println("  2. Must contain at least one digit (0-9)");
            System.out.println("Password rules:");
            System.out.println("  1. Must be at least 8 characters long");
            System.out.println("  2. Must contain at least two uppercase letters");

            // collect username and password from user
            System.out.print("\nEnter a username: ");
            String username = scanner.nextLine();

            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            try {
                // attempt to create a validated account object
                // throws PasswordVerifyException if any rule is broken
                PasswordVerify account = new PasswordVerify(username, password);
                accounts[count] = account; // add valid account to the array
                count++;
                System.out.println("Account created successfully!");

            } catch (PasswordVerifyException e) {
                // print the specific rule that was violated
                System.out.println("Invalid entry: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }

        // print all 4 valid accounts once the array is full
        System.out.println("\n--- All Registered Accounts ---");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println((i + 1) + ". " + accounts[i]);
        }

        System.out.println("\nExiting program.");
        scanner.close();
    }
}