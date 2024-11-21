package labassiment;
import java.util.Scanner;

public class OddEvenCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;  // Counter for even numbers
        int oddCount = 0;   // Counter for odd numbers

        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (-1 to stop): ");
            int number = scanner.nextInt();

            // Check if the user wants to terminate the loop
            if (number == -1) {
                break;
            }

            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the total counts of even and odd numbers
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        // Close the scanner
        scanner.close();
    }
}
