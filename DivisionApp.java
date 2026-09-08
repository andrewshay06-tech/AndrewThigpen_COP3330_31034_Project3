// Andrew Thigpen | COP 3330C-31034 | June 28, 2026
// Program: Divides two integers entered by the user.
// Input: Two integers from the keyboard.
// Output: The result of dividing the first by the second as a double (2 decimal places),
//         or an error message if the second number is zero.

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get both integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        try {
            // attempt division - throws ArithmeticException if num2 is 0
            if (num2 == 0) {
                throw new ArithmeticException("/ by zero");
            }

            // cast to double so we get a decimal result
            double result = (double) num1 / num2;
            System.out.printf("%d / %d = %.2f%n", num1, num2, result);

        } catch (ArithmeticException e) {
            // print the exception message so the user knows what went wrong
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}