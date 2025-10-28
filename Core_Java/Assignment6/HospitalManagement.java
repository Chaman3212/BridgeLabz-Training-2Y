// HospitalManagement.java
import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String id,String name,int age){ this.patientId=id; this.name=name; this.age=age; }
    public String getPatientId(){ return patientId; }
    public String getName(){ return name; }
    public int getAge(){ return age; }

    public abstract double calculateBill();
    public void getPatientDetails(){ System.out.println(patientId + ": " + name + " age " + age + " bill " + calculateBill()); }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int days;
    private List<String> records = new ArrayList<>();
    public InPatient(String id,String name,int age,int days){ super(id,name,age); this.days = days; }
    public double calculateBill(){ return days * 2000; }
    public void addRecord(String rec){ records.add(rec); }
    public List<String> viewRecords(){ return records; }
}

class OutPatient extends Patient {
    private int consultations;
    public OutPatient(String id,String name,int age,int consultations){ super(id,name,age); this.consultations = consultations; }
    public double calculateBill(){ return consultations * 500; }
}

public class HospitalManagement {
    public static void main(String[] args){
        InPatient ip = new InPatient("P01","Anu",30,5);
        ip.addRecord("Surgery done");
        OutPatient op = new OutPatient("P02","Rahul",25,1);
        List<Patient> patients = Arrays.asList(ip, op);
        for(Patient p: patients) p.getPatientDetails();
        System.out.println("InPatient records: " + ip.viewRecords());
    }
}
