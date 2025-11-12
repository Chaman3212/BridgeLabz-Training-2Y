package Assignment10;

import java.util.*;

public class RotateListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;
        List<Integer> rotated = rotateList(list, k);
        System.out.println("Rotated: " + rotated);
    }

    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();
        List<Integer> rotated = new ArrayList<>();
        for (int i = k; i < n + k; i++) {
            rotated.add(list.get(i % n));
        }
        return rotated;
    }
}

