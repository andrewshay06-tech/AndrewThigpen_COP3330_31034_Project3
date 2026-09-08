// Stores a validated username and password pair.
// Throws PasswordVerifyException in the constructor if any rule is broken.
//
// Username rules:
//   1. Must be at least 6 characters long
//   2. Must contain at least one digit
//
// Password rules:
//   1. Must be at least 8 characters long
//   2. Must contain at least two uppercase letters
public class PasswordVerify {

    private String username;
    private String password;

    // constructor - validates username and password before storing them
    // throws PasswordVerifyException if any rule is violated
    public PasswordVerify(String username, String password) throws PasswordVerifyException {
        validateUsername(username, password);
        validatePassword(username, password);
        this.username = username;
        this.password = password;
    }

    // checks username rules - throws exception if either rule fails
    private void validateUsername(String username, String password) throws PasswordVerifyException {
        // rule 1: username must be at least 6 characters
        if (username.length() < 6) {
            throw new PasswordVerifyException(username, password,
                    "Username must be at least 6 characters long.");
        }

        // rule 2: username must contain at least one digit
        if (!containsDigit(username)) {
            throw new PasswordVerifyException(username, password,
                    "Username must contain at least one digit (0-9).");
        }
    }

    // checks password rules - throws exception if either rule fails
    private void validatePassword(String username, String password) throws PasswordVerifyException {
        // rule 1: password must be at least 8 characters
        if (password.length() < 8) {
            throw new PasswordVerifyException(username, password,
                    "Password must be at least 8 characters long.");
        }

        // rule 2: password must contain at least two uppercase letters
        if (countUppercase(password) < 2) {
            throw new PasswordVerifyException(username, password,
                    "Password must contain at least two uppercase letters.");
        }
    }

    // returns true if the string has at least one digit character
    private boolean containsDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // counts how many uppercase letters are in the string
    private int countUppercase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // returns the stored username
    public String getUsername() {
        return username;
    }

    // returns the stored password
    public String getPassword() {
        return password;
    }

    // formats the object as "Username: x | Password: y" for printing
    @Override
    public String toString() {
        return "Username: " + username + " | Password: " + password;
    }
}