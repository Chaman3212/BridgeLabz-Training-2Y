package Assignment10;

import java.util.*;

public class NthFromEndExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println("Nth from end: " + findNthFromEnd(list, n));
    }

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        for (int i = 0; i < n; i++) first.next();
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }
}

