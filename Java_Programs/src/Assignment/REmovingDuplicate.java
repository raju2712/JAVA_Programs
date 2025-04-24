package Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class REmovingDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 2, 3};

        // Use LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert set back to array (optional)
        Integer[] uniqueArray = set.toArray(new Integer[0]);

        // Print the result
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

}
