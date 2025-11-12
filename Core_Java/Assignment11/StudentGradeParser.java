package Assignment11;

// StudentGradeParser.java

import java.util.*;

public class StudentGradeParser {
    public static void main(String[] args) {
        List<String> grades = Arrays.asList("90", "A+", "85", "B");

        for (String grade : grades) {
            try {
                int g = Integer.parseInt(grade);
                System.out.println("Parsed grade: " + g);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}

