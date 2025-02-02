
import java.util.Scanner;

/**
 * This class is responsible for taking user input and storing it in an array.
 */
class UserInput {


    /**
     * This method prompts the user to enter 5 integers and stores them in an array.
     * 
     * @return an integer array containing 5 user-input values.
     */
    int[] arrayInput() {
        Scanner scan = new Scanner(System.in);  // Creating a Scanner object for user input
        int[] array = new int[5];  // Declaring an integer array of size 5
        System.out.println("Enter 5 numbers:");

        // Loop to take input from the user and store it in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        return array; // Returning the filled array
    }
}
