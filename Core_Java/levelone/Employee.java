

package levelone;

class Employee {
    // non-static variables
    String name = "Rohan";
    int id = 1;
    double salary = 500000;

    // method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(); // creating object
        emp.displayEmployee(); // calling the display method
    }
}

