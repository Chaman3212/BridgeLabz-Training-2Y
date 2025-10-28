// EmployeeManagement.java
import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary){
        this.employeeId = employeeId; this.name = name; this.baseSalary = baseSalary;
    }
    // encapsulation
    public String getEmployeeId(){ return employeeId; }
    public String getName(){ return name; }
    public double getBaseSalary(){ return baseSalary; }
    public void setBaseSalary(double baseSalary){ this.baseSalary = baseSalary; }

    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("ID:" + employeeId + " Name:" + name + " Salary:" + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedAllowance;

    public FullTimeEmployee(String id,String name,double base,double allowance){
        super(id,name,base); this.fixedAllowance = allowance;
    }
    public double calculateSalary(){ return getBaseSalary() + fixedAllowance; }
    public void assignDepartment(String dept){ this.department = dept; }
    public String getDepartmentDetails(){ return department; }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id,String name,double hourly, int hours){
        super(id,name,0); this.hourlyRate = hourly; this.hoursWorked = hours;
    }
    public double calculateSalary(){ return hoursWorked * hourlyRate; }
    public void assignDepartment(String dept){ this.department = dept; }
    public String getDepartmentDetails(){ return department; }
}

public class EmployeeManagement {
    public static void main(String[] args){
        List<Employee> emps = new ArrayList<>();
        FullTimeEmployee f = new FullTimeEmployee("F01","Alice",50000,8000);
        f.assignDepartment("IT");
        PartTimeEmployee p = new PartTimeEmployee("P01","Bob",500,40);
        p.assignDepartment("Support");
        emps.add(f); emps.add(p);
        for(Employee e: emps) e.displayDetails(); // polymorphism
    }
}

