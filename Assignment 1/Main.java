/*
NAME: Om Narayan Pandit
PRN: 23070126083
BATCH: AIML B1
*/


import java.util.Arrays; // Importing the Arrays class for array-related operations.
import java.util.Scanner; // Importing the Scanner class for user input.

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // Create an instance of the Calculator class.

        Scanner scanch = new Scanner(System.in); // Create a Scanner object for user input.

        // Display menu options for the user.
        System.out.println("Enter your choice: \n" +
                "1) Add \n" +
                "2) Subtract \n" +
                "3) Multiply \n" +
                "4) Divide \n" +
                "5) Fibonacci Series \n" +
                "6) Mean \n" +
                "7) Variance");

        int ch = scanch.nextInt(); // Read the user's choice.

        // Use a switch-case to handle the user's choice.
        switch (ch) {
            case 1: // Case for addition.
                System.out.println("Sum is: " + cal.addition());
                break;
            case 2: // Case for subtraction.
                System.out.println("Difference is: " + cal.subtraction());
                break;
            case 3: // Case for multiplication.
                System.out.println("Product is: " + cal.multiply());
                break;
            case 4: // Case for division.
                System.out.println("Result is: " + cal.division());
                break;
            case 5: // Case for Fibonacci series.
                System.out.println("Series:\n" + Arrays.toString(cal.fibonacci()));
                break;
            case 6: // Case for mean calculation.
                System.out.println("Mean is: " + cal.mean());
                break;
            case 7: // Case for variance calculation.
                System.out.println("Variance is: " + cal.variance());
                break;
            default: // Handle invalid input.
                System.out.println("Invalid choice!");
        }
    }
}
