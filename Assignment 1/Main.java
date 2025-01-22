
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        Scanner scanch = new Scanner(System.in);
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
            default:
                throw new AssertionError();
        }
        
        
    }
}