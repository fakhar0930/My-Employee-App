package Package2;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return " Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Amit", "IT", 60000),
                new Employee("Riya", "HR", 45000),
                new Employee("Suresh", "IT", 70000),
                new Employee("Neha", "Finance", 55000),
                new Employee("Karan", "HR", 48000),
                new Employee("Priya", "Finance", 62000),
                new Employee("Vikram", "IT", 80000),
                new Employee("Anita", "HR", 50000)
        );

       Map<String,List<Double>> grouped= employees
               .stream()
               .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getSalary,Collectors.toList())));

        System.out.println(grouped);


        Map<String,List<Employee>> empList= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(empList);
        System.out.println();

        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList())));


        String s= "Hello World";

        Map<Character, Long> map= s
                .chars()
                .mapToObj(ch->(char) ch)
                .collect(Collectors
                        .groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        Map<String,Double> getSalaryByDept= employees
                .stream()
                .collect(Collectors.
                        groupingBy(Employee::getDepartment,Collectors.
                                summingDouble(Employee::getSalary)));

        System.out.println("Salaries By Department: " + getSalaryByDept);


        Map<String,Double> avgSalaryByDept= employees
                .stream()
                .collect(Collectors.
                        groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average Salaries By Department: " + avgSalaryByDept);

        Map<String, Map<String, List<Employee>>> nested = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.groupingBy(emp -> {
                            if(emp.getSalary() > 70000) return "High";
                            else if(emp.getSalary() > 50000) return "Medium";
                            else return "Low";
                        })
                ));

        System.out.println(nested);



    }

}
