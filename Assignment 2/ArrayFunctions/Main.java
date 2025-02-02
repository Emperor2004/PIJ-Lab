
import java.util.*;

class Main {

    public static void main(String[] args) {
        UserInput in = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        int[] arr = in.arrayInput();

        Scanner scanch = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice: \n1) Show Even and Odd number \n2) Show difference of elements in consecutive indices \n3) Show Convert \n4) Display");

            int ch = scanch.nextInt();

            switch (ch) {
                case 1:
                    functions.oddEven(arr);
                    ;
                    break;
                case 2:
                    functions.diffInt(arr);
                    break;
                case 3:
                    functions.displayArray(arr);
                    functions.toArrayList(arr);
                    break;
                case 4:
                    functions.displayArray(arr);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
