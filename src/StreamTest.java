import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {


        // Sorting a string using character stream
        String str = "sksjf4r8394w%s83$#skw4393";

        char [] arr = str.toCharArray();

        Stream<Character> charStream = IntStream.range(0,arr.length).mapToObj(i->arr[i]);

        charStream
                .sorted()
                .forEach(System.out::print);
    }

}
