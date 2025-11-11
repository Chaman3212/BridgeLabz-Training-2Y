package Assignment9;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String message;
    String type; // "critical", "normal", "info"

    Alert(String msg, String type) {
        this.message = msg; this.type = type;
    }

    public String toString() { return type.toUpperCase() + ": " + message; }
}

public class HospitalAlerts {
    public static void main(String[] args) {
        List<Alert> alerts = List.of(
                new Alert("Patient heart rate high!", "critical"),
                new Alert("Room 12 cleaned", "info"),
                new Alert("Patient ready for discharge", "normal")
        );

        Predicate<Alert> criticalFilter = a -> a.type.equals("critical");
        List<Alert> criticalAlerts = alerts.stream()
                .filter(criticalFilter)
                .collect(Collectors.toList());

        System.out.println("Critical Alerts:");
        criticalAlerts.forEach(System.out::println);
    }
}
