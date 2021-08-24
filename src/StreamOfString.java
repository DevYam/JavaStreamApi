import java.util.stream.Stream;

public class StreamOfString {
    public static void main(String[] args) {
        Stream.of("Ava", "Java", "Lava", "Ada")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);
    }
}
