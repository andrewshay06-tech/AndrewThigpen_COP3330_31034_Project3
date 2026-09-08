// Custom exception for invalid username/password entries.
// Thrown by PasswordVerify when a rule is violated.
public class PasswordVerifyException extends Exception {

    private String username;
    private String password;

    // constructor - takes the username and password that caused the violation
    // message explains which rule was broken
    public PasswordVerifyException(String username, String password, String message) {
        super(message);
        this.username = username;
        this.password = password;
    }

    // returns the username tied to this exception
    public String getUsername() {
        return username;
    }

    // returns the password tied to this exception
    public String getPassword() {
        return password;
    }
}