
import java.util.Scanner;


class Main {

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age not qualified...");
        }
        else {
            System.out.println("Valid...");
        }
    }

    public static void notZero(int n) throws ArithmeticException {
        if (n == 0) {
            throw new ArithmeticException("Number can't be zero");
        } else {
            System.out.println("Valid...");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            notZero(a);
            int b = scan.nextInt();
            notZero(b);
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}