import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        fruits.addFirst("Orange");
        fruits.addLast("Grapes");

        System.out.println("After Adding: " + fruits);

        fruits.removeFirst();
        fruits.removeLast();

        System.out.println("After Removing: " + fruits);

        System.out.println("First Fruit: " + fruits.getFirst());
    }
}
