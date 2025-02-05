import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeStreamProcessing {
    public static void main(String[] args) {
        // List of Employees
        List<Employee> employees = Arrays.asList(
                new Employee("John", 28, 50000),
                new Employee("Emma", 35, 70000),
                new Employee("Sophia", 40, 90000),
                new Employee("Michael", 32, 65000),
                new Employee("Daniel", 29, 48000));

        // Filter employees older than 30
        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .collect(Collectors.toList());

        // Collect names of these employees
        List<String> employeeNames = filteredEmployees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        // Find the average salary of employees older than 30
        double averageSalary = filteredEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0); // Default value if no employees meet the condition

        // Print results
        System.out.println("Employees older than 30: " + employeeNames);
        System.out.println("Average Salary: " + averageSalary);
    }
}
