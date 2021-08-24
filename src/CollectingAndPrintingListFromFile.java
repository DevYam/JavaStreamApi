import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndPrintingListFromFile {

    public static void main(String[] args) throws IOException {
        List<String> bandStream = Files.lines(Paths.get("C:\\Code\\JavaStreamAPI\\src\\bands.txt"))
                .filter(x -> x.contains("ome"))
                .collect(Collectors.toList());

        bandStream.forEach(x -> System.out.println(x));
    }
}
