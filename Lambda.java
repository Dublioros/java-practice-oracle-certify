import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Lucas");
        people.add("Jose");
        people.add("Miguel");

        // {} for return only on Lambda expressions
        people.removeIf(name -> name.startsWith("M"));
        people.forEach(System.out::println);
    }
}
