import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hard-coded correct credentials
        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
