import java.util.stream.IntStream;

public class CreateSkipAndPrintIntegerStream {

    public static void main(String[] args) {

        // Creating and skipping numbers in intstream
        IntStream
                .range(0,10)
                .skip(5)


                // Using lambda expression in place of a int consumer ::
                .forEach(x -> System.out.println(x));
    }
}
