package Assignment9;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> names = List.of("Amol", "Riya", "Karan", "Sneha");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase Names:");
        upperNames.forEach(System.out::println);
    }
}

