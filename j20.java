class Main {

    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int number = 6;

        int result = square(number);

        System.out.println("Number: " + number);
        System.out.println("Square: " + result);
    }
}
