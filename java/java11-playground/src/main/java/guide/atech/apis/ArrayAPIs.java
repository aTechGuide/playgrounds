package guide.atech.apis;

import java.util.Arrays;

public class ArrayAPIs {

    public static void main(String[] args) {
        // 1D Array

        int [] arr1 = {1, 2, 3};
        System.out.println(Arrays.toString(arr1));

        int [][] arr2 = new int[3][2];

        Arrays.fill(arr1, 5);


        // 2D Array
        int[][] twoD = {{1,2}, {3,4}};
        Arrays.stream(twoD)
                .forEach( row -> System.out.println(Arrays.toString(row)));
    }
}
