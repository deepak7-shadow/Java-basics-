class Main {
    public static void main(String[] args) {
        int num = 7;
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= num / i; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}