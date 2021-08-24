import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFromFile {

    public static void main(String[] args) throws IOException {

        Path pathToFile = Paths.get("C:\\Code\\JavaStreamAPI\\src\\bands.txt");

        Stream<String> stm = Files.lines(pathToFile);

        stm
                .sorted()
                .filter(x -> x.length()>5)
                .forEach(System.out::println);

        // We have to close the stream to prevent memory leaks
        stm.close();
    }
}
