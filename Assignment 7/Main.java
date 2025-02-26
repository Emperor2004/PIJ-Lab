class Main {

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age not qualified");
        }
        else {
            System.out.println("Valid...");
        }
    }
    public static void main(String args[]) {
        try {
            checkAge(12);
        } catch (AgeException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Done.");
        }
    }
}