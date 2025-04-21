// ===== Calculator.java =====

public class Calculator {
    /**
     * Returns the sum of two numbers.
     * @param a first operand
     * @param b second operand
     * @return a + b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Returns the difference between two numbers.
     * @param a first operand
     * @param b second operand
     * @return a - b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Returns the product of two numbers.
     * @param a first operand
     * @param b second operand
     * @return a * b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Returns the quotient of two numbers.
     * @param a numerator
     * @param b denominator; must not be zero
     * @return a / b
     * @throws ArithmeticException if b is zero
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Returns the square of a number.
     * @param a the number to square
     * @return a * a
     */
    public static double square(double a) {
        return a * a;
    }

    /**
     * Returns the cube of a number.
     * @param a the number to cube
     * @return a * a * a
     */
    public static double cube(double a) {
        return a * a * a;
    }

    /**
     * Returns the square root of a number.
     * @param a number to find the square root of; must be non-negative
     * @return square root of a
     * @throws ArithmeticException if a is negative
     */
    public static double squareRoot(double a) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("Cannot take square root of a negative number");
        }
        return Math.sqrt(a);
    }
}