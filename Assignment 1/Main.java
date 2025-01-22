
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        Scanner scanch = new Scanner(System.in);
        System.out.println("Enter your choice: \n1) Add \n2) Substract \n3) Multiply \n4) Divide \n5) Fibonacci Series \n6) Mean \n7) Variance");
        int ch = scanch.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Sum is: " + cal.addition());
                break;
            case 2:
                System.out.println("Difference is: " + cal.subtraction());
                break;
            case 3:
                System.out.println("Product is: " + cal.multiply());
                break;
            case 4:
                System.out.println("Result is: " + cal.division());
                break;
            case 5:
                System.out.println("Series:\n" + Arrays.toString(cal.fibonacci()));
                break;
            case 6:
                System.out.println("Mean is: " + cal.mean());
                break;
            case 7:
                System.out.println("Variance is: " + cal.variance());
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        
    }
}