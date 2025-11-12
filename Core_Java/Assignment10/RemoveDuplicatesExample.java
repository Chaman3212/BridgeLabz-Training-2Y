package Assignment10;

import java.util.*;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (Integer num : list) {
            if (seen.add(num)) result.add(num);
        }

        System.out.println("Without Duplicates: " + result);
    }
}

