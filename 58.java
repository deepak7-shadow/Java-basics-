import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
            Arrays.asList(50, 20, 40, 10, 30)
        );

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers, Comparator.reverseOrder());

        System.out.println("Descending Order: " + numbers);
    }
}
