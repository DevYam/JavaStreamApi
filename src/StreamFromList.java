import java.util.Arrays;
import java.util.List;

public class StreamFromList {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Abhi", "Anu", "Rohan", "James", "Darwin", "Toni");

        // Streaming from a list of String
        strList
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .sorted()
                .forEach(System.out::println);
    }
}
