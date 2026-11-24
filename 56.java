import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        System.out.println("Even Numbers:");

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
