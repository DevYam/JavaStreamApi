import java.util.Arrays;

public class FilterNames {

    public static void main(String[] args) {
        String [] strArr = {"Rohan", "Sita", "Shyam", "Albert", "jim", "Abhishek", "Rahul"};

        Arrays.stream(strArr)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);
    }
}
