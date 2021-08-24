import java.util.Arrays;

public class AvgOfSquaresOfIntArray {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8, 10};

        // Finding the average of squares of int array

        Arrays.stream(arr)
                .map(x -> x*x )
                .average()
                .ifPresent(System.out::print);


    }
}
