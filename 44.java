class Main {
    public static void main(String[] args) {

        try {
            int number = 10 / 2;
            System.out.println("Result: " + number);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program completed");
    }
}
