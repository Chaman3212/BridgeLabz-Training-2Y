package Assignment9;

import java.util.*;

public class PatientIDs {
    public static void main(String[] args) {
        List<String> patientIds = List.of("P101", "P102", "P103", "P104");

        // Using method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}

