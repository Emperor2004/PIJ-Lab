class Calculator {

    // Method to perform addition of two numbers.
    int addition() {
        int[] num; // Array to store two numbers.
        UserInput in = new UserInput(); // Create an instance of UserInput to get user input.

        num = in.userInputDouble(); // Get two numbers from the user.
        int sum = num[0] + num[1]; // Calculate the sum of the two numbers.

        return sum; // Return the result.
    }

    // Method to perform subtraction of two numbers.
    int subtraction() {
        int[] num; // Array to store two numbers.
        UserInput in = new UserInput(); // Create an instance of UserInput to get user input.

        num = in.userInputDouble(); // Get two numbers from the user.
        int diff = num[0] - num[1]; // Calculate the difference between the two numbers.

        return diff; // Return the result.
    }

    // Method to perform multiplication of two numbers.
    int multiply() {
        int[] num; // Array to store two numbers.
        UserInput in = new UserInput(); // Create an instance of UserInput to get user input.

        num = in.userInputDouble(); // Get two numbers from the user.
        int pro = num[0] * num[1]; // Calculate the product of the two numbers.

        return pro; // Return the result.
    }

    // Method to perform division of two numbers.
    double division() {
        int[] num; // Array to store two numbers.
        UserInput in = new UserInput(); // Create an instance of UserInput to get user input.

        num = in.userInputDouble(); // Get two numbers from the user.
        if (num[1] == 0) { // Check if the divisor is zero.
            System.out.println("Can't divide by 0"); // Print error message.
            return 0; // Return 0 as an indication of error.
        }
        int quo = num[0] / num[1]; // Calculate the quotient.
        return quo; // Return the result.
    }

    // Method to generate a Fibonacci sequence of a specified length.
    int[] fibonacci() {
        int num; // Variable to store the length of the sequence.
        UserInput in = new UserInput(); // Create an instance of UserInput to get user input.

        System.out.println("Enter no. of items:");
        num = in.userInputSingle(); // Get the length of the sequence from the user.

        int[] arr = new int[num]; // Array to store the Fibonacci sequence.
        arr[0] = 0; // First number of the sequence.
        arr[1] = 1; // Second number of the sequence.

        // Generate the rest of the sequence.
        for (int i = 2; i < num; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr; // Return the Fibonacci sequence.
    }

    // Method to calculate the mean of an array of numbers.
    double mean() {
        UserInput in = new UserInput(); // Create an instance of UserInput to get user input.
        int[] array = in.userInputArray(); // Get the array of numbers from the user.
        int sum = 0; // Variable to store the sum of the numbers.

        // Calculate the sum of the numbers.
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length; // Return the mean as a double.
    }

    // Method to calculate the variance of an array of numbers.
    double variance() {
        UserInput in = new UserInput(); // Create an instance of UserInput to get user input.
        int[] array = in.userInputArray(); // Get the array of numbers from the user.
        int sum = 0; // Variable to store the sum of the numbers.

        // Calculate the sum of the numbers.
        for (int num : array) {
            sum += num;
        }

        // Calculate the mean of the numbers.
        double mean = (double) sum / array.length;

        double sumSquaredDiff = 0; // Variable to store the sum of squared differences from the mean.

        // Calculate the sum of squared differences.
        for (int num : array) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }

        return sumSquaredDiff / array.length; // Return the variance.
    }
}
