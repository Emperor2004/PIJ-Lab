import java.util.*;

/**
 * This class provides various utility functions for handling arrays and ArrayLists, 
 * including displaying, converting, and processing them.
 */
class ArrayFunctions {

    /**
     * Displays the given ArrayList.
     *
     * @param arrayList The ArrayList of integers to be displayed.
     */
    public void displayArrayList(ArrayList<Integer> arrayList) {
        System.out.println("ArrayList is: " + arrayList);
    }

    /**
     * Displays the given integer array.
     *
     * @param array The integer array to be displayed.
     */
    public void displayArray(int[] array) {
        System.out.println("Array is: " + Arrays.toString(array));
    }

    /**
     * Separates even and odd numbers from the given array and displays them.
     *
     * @param array The integer array to be processed.
     */
    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>(); // List to store even numbers
        ArrayList<Integer> odd = new ArrayList<>();  // List to store odd numbers

        // Iterating through the array to classify numbers as even or odd
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]); // Adding even numbers
            } else {
                odd.add(array[i]);  // Adding odd numbers
            }
        }

        // Display the classified lists
        displayArrayList(even);
        displayArrayList(odd);
    }

    /**
     * Computes the difference between consecutive elements in the given array and displays the results.
     *
     * @param array The integer array to process.
     */
    public void diffInt(int[] array) {
        ArrayList<Integer> diff = new ArrayList<>();

        // Iterating through the array to compute differences between adjacent elements
        for (int j = 0; j < array.length - 1; j++) {
            diff.add(array[j] - array[j + 1]);
        }

        // Display the list of differences
        displayArrayList(diff);
    }

    /**
     * Converts an ArrayList to an array and displays it.
     *
     * @param arrayList The ArrayList to be converted.
     */
    public void toArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];

        // Copying elements from ArrayList to array
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        // Display the converted array
        displayArray(array);
    }

    /**
     * Converts an integer array to an ArrayList and displays it.
     *
     * @param array The integer array to be converted.
     */
    public void toArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Copying elements from array to ArrayList
        for (int item : array) {
            arrayList.add(item);
        }

        // Display the converted ArrayList
        displayArrayList(arrayList);
    }
}
