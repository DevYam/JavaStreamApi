import java.util.stream.IntStream;

public class CreateAndPrintIntegerStream {

    public static void main(String[] args) {

        // Creating and printing int stream
        IntStream
                .range(0,10)
                .forEach(System.out::println);
    }
}
