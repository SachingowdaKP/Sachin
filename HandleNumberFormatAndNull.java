package labassiment;
import java.util.Scanner;

public class HandleNumberFormatAndNull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String userInput = scanner.nextLine(); // Read input as a string

            // Check for null input (extra safety for potential null values)
            if (userInput == null) {
                throw new NullPointerException("Input is null.");
            }

            // Attempt to convert the input to an integer
            int number = Integer.parseInt(userInput);
            System.out.println("Converted to integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null input is not allowed.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
