interface Greeting {
    void sayHello();
}

class Main {
    public static void main(String[] args) {

        Greeting g = () -> {
            System.out.println("Hello Deepak!");
            System.out.println("Welcome to Java Lambda Expressions");
        };

        g.sayHello();
    }
}
