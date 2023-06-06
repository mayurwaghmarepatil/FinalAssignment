package ineuron;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
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

public class  FinalAssignment6 {
    public static void main(String[] args) {
       
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 50000.0));
        employees.add(new Employee("Alice", 25, 40000.0));
        employees.add(new Employee("Bob", 35, 60000.0));
        employees.add(new Employee("David", 28, 55000.0));

       
        List<Employee> sortedBySalary = employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .collect(Collectors.toList());

        System.out.println("Employees sorted by salary (ascending):");
        sortedBySalary.forEach(e -> System.out.println(e.getName() + " - Salary: " + e.getSalary()));

        System.out.println();

       
        List<Employee> filteredByAge = employees.stream()
                .filter(e -> e.getAge() < 30)
                .collect(Collectors.toList());

        System.out.println("Employees below 30 years old:");
        filteredByAge.forEach(e -> System.out.println(e.getName() + " - Age: " + e.getAge()));
    }
}

