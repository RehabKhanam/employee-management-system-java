class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("------------------------");
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Rahul", 35000);
        Employee emp2 = new Employee(102, "Priya", 42000);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}