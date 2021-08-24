import java.util.stream.IntStream;

public class PrintSumIntStream {

    public static void main(String[] args) {

        // Printing sum of numbers using int stream

        System.out.println(
                IntStream

                        // Last number of range is exclusive
                    .range(1,6)
                     .sum()
        );
    }
}
