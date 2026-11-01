class Main {
    public static void main(String[] args) {
        double a = 20;
        double b = 10;
        char operator = '+';

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
