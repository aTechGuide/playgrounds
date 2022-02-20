package guide.atech.apis;

import guide.atech.model.Employee;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Ref
 * - https://www.baeldung.com/java-sorting-arrays
 */
public class SortOneDimenAPIs {

    public static void main(String[] args) {

        // primitive
        int [] intData = {2, 5, 1, 9, 3};
        Arrays.sort(intData); // In place sorting in Ascending Order,
        // For Descending Order there is NO straight Forward API for Primitives, Opt1: Sort + reverse; Opt2: Convert to Integer

        System.out.println(Arrays.toString(intData)); // [1, 2, 3, 5, 9]

        // Object that implement Comparable
        String [] stringData = {"kamran", "daud", "ali"};
        Arrays.sort(stringData);

        System.out.println(Arrays.toString(stringData)); // [ali, daud, kamran] Ascending

        Arrays.sort(stringData, Comparator.reverseOrder());

        System.out.println(Arrays.toString(stringData)); // [kamran, daud, ali] Descending

        // Object that Do NOT implement Comparable
        Employee [] empData = {new Employee(2, "kamran"), new Employee(3, "ali")};

        Arrays.sort(empData, Comparator.comparing(Employee::getAge));

        System.out.println(Arrays.toString(empData)); // [Employee{age=2, name='kamran'}, Employee{age=3, name='ali'}]

        Arrays.sort(empData, Comparator.comparing(Employee::getAge).reversed());

        System.out.println(Arrays.toString(empData)); // [Employee{age=3, name='ali'}, Employee{age=2, name='kamran'}]
    }
}
