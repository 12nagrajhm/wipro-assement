
abstract class Employee {
    protected String name;
    protected int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public abstract double calculateSalary();

    public abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee:");
        System.out.println("Name: " + name + ", Employee ID: " + empId);
        System.out.println("Monthly Salary: $" + calculateSalary());
        System.out.println("-------------------------------");
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int empId, double hourlyRate, int hoursWorked) {
        super(name, empId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee:");
        System.out.println("Name: " + name + ", Employee ID: " + empId);
        System.out.println("Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("-------------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee("Alice Johnson", 101, 5000);
        employees[1] = new PartTimeEmployee("Bob Smith", 102, 20, 120);

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
