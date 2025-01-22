
import java.util.*;
import java.util.Arrays;

class ArrayFunctions {

    public void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]);
            } else {
                odd.add(array[i]);
            }
        }
        display(even);
        display(odd);
    }

    public void diffInt(int[] array) {
        ArrayList<Integer> diff = new ArrayList<Integer>();

        for (int j = 0; j<array.length-1; j++) {
            diff.add(array[j]-array[j+1]);
        }

        display(diff);
    }

}
