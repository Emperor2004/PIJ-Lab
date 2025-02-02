
import java.util.*;

class ArrayFunctions {

    public void displayArrayList(ArrayList<Integer> array) {
        System.out.println("ArrayList is: " + array);
    }
    public void displayArray(int[] array) {
        System.out.println("Array is: " + Arrays.toString(array));
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
        displayArrayList(even);
        displayArrayList(odd);
    }

    public void diffInt(int[] array) {
        ArrayList<Integer> diff = new ArrayList<Integer>();

        for (int j = 0; j<array.length-1; j++) {
            diff.add(array[j]-array[j+1]);
        }

        displayArrayList(diff);
    }

    public void toArray(ArrayList arrayList) {

        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = (int) arrayList.get(i);
        }
        displayArray(array);
    }

    public void toArrayList(int[] array) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int item : array) {
            arrayList.add(item);
        }
        displayArrayList(arrayList);
    }

}
