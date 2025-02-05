import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface StringProcessor {
    String process(String str); // Functional interface method
}

public class LambdaSortingAndProcessing {
    public static void main(String[] args) {
        // List of strings
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Sorting in reverse alphabetical order using lambda
        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted List (Reverse Order): " + names);

        // Functional Interface with Lambda Expression
        StringProcessor processor = str -> str.toUpperCase();

        // Processing the list to uppercase
        names.forEach(name -> System.out.println("Uppercase: " + processor.process(name)));
    }
}
