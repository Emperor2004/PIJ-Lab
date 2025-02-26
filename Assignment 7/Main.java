class Main {
    public static void main(String args[]) {
        int a = 2;
        int b = 0;

        try {
            System.out.println("Division is: " + a/b);
        } catch (ArithmeticException e) {
            // System.out.println("Denominator is Zero");
            e.printStackTrace(System.out);
        }
    }
}