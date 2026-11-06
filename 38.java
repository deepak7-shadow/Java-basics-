interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a button");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();
    }
}
