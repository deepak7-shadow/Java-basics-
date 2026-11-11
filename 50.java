import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Deepak");
        names.add("Rahul");
        names.add("Arun");
        names.add("Kiran");

        Iterator<String> itr = names.iterator();

        System.out.println("Student Names:");

        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}
