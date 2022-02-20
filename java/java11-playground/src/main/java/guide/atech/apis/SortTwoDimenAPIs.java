package guide.atech.apis;

import java.util.Arrays;

public class SortTwoDimenAPIs {

    public static void main(String[] args) {
        int [][] intData = {{2, 1}, {8, 4}, {3, 9}};

        Arrays.sort(intData, (a, b) -> a[0] - b[0]);

        Arrays.stream(intData)
                .forEach( row -> System.out.println(Arrays.toString(row)));
    }
}
