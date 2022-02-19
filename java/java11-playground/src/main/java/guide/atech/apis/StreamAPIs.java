package guide.atech.apis;

import java.util.stream.IntStream;

/**
 * Ref
 * - https://developer.ibm.com/articles/j-java8idioms3/
 */
public class StreamAPIs {

    public static void main(String[] args) {

        // Iterate Forward
        IntStream.range(1, 4)
                .forEach(System.out::println); // Prints 1, 2, 3

        // Iterate Forward + Second Param Included
        IntStream.rangeClosed(1, 4)
                .forEach(System.out::println); // Prints 1, 2, 3, 4

        // Iterate In Steps Or Reverse Scenario
        IntStream.iterate(25, i -> i - 1)
                .limit(2)
                .forEach(System.out::println); // Prints 25, 24
    }
}
