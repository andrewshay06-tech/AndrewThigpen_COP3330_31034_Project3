# Account & Password Validator

**Andrew Thigpen | CEN 3024C | CRN 13038**

## Description

This project simulates a basic account creation system with custom exception handling in Java. The main program, AccountApp, prompts the user to enter a username and password, then validates each entry against a set of rules before creating an account. If a rule is broken, the program catches a custom exception, prints a specific error message telling the user what went wrong, and lets them try again. It keeps looping until four valid accounts have been created, then prints the full list.

The project also includes a smaller companion program, DivisionApp, which divides two integers entered by the user and demonstrates handling a built-in ArithmeticException when dividing by zero.

Username rules:
- Must be at least 6 characters long
- Must contain at least one digit (0-9)

Password rules:
- Must be at least 8 characters long
- Must contain at least two uppercase letters

## Concepts and Tools Used

This assignment focused on Java exception handling. The PasswordVerifyException class extends Java's built-in Exception class to create a custom, checked exception specific to this program. The PasswordVerify class handles all validation logic in its constructor and throws the custom exception with a message explaining exactly which rule failed. AccountApp then uses a try-catch block to catch that exception, display the error, and reprompt the user without crashing the program. DivisionApp demonstrates the same try-catch pattern using a standard Java exception instead of a custom one.

Other concepts used include arrays for storing multiple account objects, loops for repeating input until valid data is collected, a Scanner for reading user input, and an overridden toString method for formatting output.

## Expected Inputs and Outputs

**AccountApp:** Takes a username and password from the keyboard, repeated for four accounts. Outputs either an error message describing the rule that was violated, or a confirmation message. Once four accounts are successfully created, it prints all four as a formatted list.

**DivisionApp:** Takes two integers from the keyboard. Outputs the result of dividing the first by the second as a decimal, or an error message if the second number is zero.
