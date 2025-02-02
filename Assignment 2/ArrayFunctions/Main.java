/*
NAME: Om Narayan Pandit
PRN: 23070126083
BATCH: AIML B1
*/

import java.util.*;

/**
 * The Main class serves as the entry point of the program, allowing users to perform 
 * various operations on an integer array, such as classifying even/odd numbers, 
 * computing differences between consecutive elements, and converting between 
 * arrays and ArrayLists.
 */
class Main {

    /**
     * The main method that drives the program.
     * It takes user input, processes it, and provides a menu-driven interface 
     * for performing operations on the array.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        UserInput in = new UserInput();  // Object to handle user input
        ArrayFunctions functions = new ArrayFunctions(); // Object to perform array operations

        int[] arr = in.arrayInput();  // Taking user input for the integer array

        Scanner scanch = new Scanner(System.in);  // Scanner object to take user choice input

        while (true) {
            // Displaying the menu options
            System.out.println("""
                               Enter your choice: 
                               1) Show Even and Odd numbers
                               2) Show difference of elements in consecutive indices
                               3) Convert between Array and ArrayList
                               4) Display Array
                               5) Exit""");

            int ch = scanch.nextInt();  // Taking user input for choice

            // Performing operations based on user's choice
            switch (ch) {
                case 1:
                    functions.oddEven(arr); // Classifies and displays even and odd numbers
                    break;
                case 2:
                    functions.diffInt(arr); // Computes and displays differences between consecutive elements
                    break;
                case 3:
                    functions.displayArray(arr); // Displays the original array
                    functions.toArrayList(arr); // Converts and displays ArrayList representation
                    break;
                case 4:
                    functions.displayArray(arr); // Displays the array
                    break;
                case 5:
                    System.out.println("Bye...!");
                    scanch.close(); // Closes the Scanner object
                    System.exit(0); // Exiting the program
                default:
                    System.out.println("Invalid Choice!"); // Handles invalid inputs
            }
        }
    }
}
