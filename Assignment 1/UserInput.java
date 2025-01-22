
import java.util.*;

class UserInput {

    int[] userInputDouble() {
        int[] numbers = new int[2];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        numbers[0] = scan.nextInt();

        System.out.println("Enter 2nd Number: ");
        numbers[1] = scan.nextInt();

        return numbers;
    }

    int userInputSingle() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }
}
