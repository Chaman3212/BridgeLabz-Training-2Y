package Assignment9;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    Invoice(String id) { this.transactionId = id; }
    public String toString() { return "Invoice for: " + transactionId; }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> transactionIds = List.of("TXN001", "TXN002", "TXN003");

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new) // Constructor reference
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

