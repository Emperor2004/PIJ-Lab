import java.util.*; // Importing the Java utilities package for Scanner and other utilities.

class UserInput {

    // Method to take input for two integers and return them in an array.
    int[] userInputDouble() {
        int[] numbers = new int[2]; // Array to store two integers.
        Scanner scan = new Scanner(System.in); // Create a Scanner object for input.

        System.out.println("Enter 1st Number: ");
        numbers[0] = scan.nextInt(); // Read the first integer.

        System.out.println("Enter 2nd Number: ");
        numbers[1] = scan.nextInt(); // Read the second integer.

        return numbers; // Return the array containing two integers.
    }

    // Method to take input for a single integer.
    int userInputSingle() {
        Scanner scan = new Scanner(System.in); // Create a Scanner object for input.
        int number = scan.nextInt(); // Read an integer from the user.
        return number; // Return the integer.
    }

    // Method to take input for an array of integers from the user.
    int[] userInputArray() {
        Scanner scan = new Scanner(System.in); // Create a Scanner object for input.
        
        // Prompt the user to enter the size of the array.
        System.out.println("Enter no.of items in the array:");
        int num = scan.nextInt(); // Read the size of the array.

        // Prompt the user to enter the elements of the array.
        System.out.println("\nEnter the items:");
        int[] array = new int[num]; // Create an array of the specified size.
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt(); // Read each element of the array.
        }
        return array; // Return the array containing user inputs.
    }
}
