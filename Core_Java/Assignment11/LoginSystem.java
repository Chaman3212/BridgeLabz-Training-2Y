package Assignment11;

// LoginSystem.java

import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class LoginSystem {
    private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "1234";

    public static void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(VALID_USER) || !pass.equals(VALID_PASS)) {
            throw new InvalidCredentialsException("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            try {
                validate(user, pass);
                System.out.println("Login successful!");
                loggedIn = true;
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage() + " Please try again.\n");
            }
        }

        sc.close();
    }
}
