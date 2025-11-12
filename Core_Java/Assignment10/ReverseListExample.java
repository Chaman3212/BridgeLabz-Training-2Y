package Assignment10;

import java.util.*;

public class ReverseListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> reversed = reverseList(list);
        System.out.println("Reversed: " + reversed);
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
}

