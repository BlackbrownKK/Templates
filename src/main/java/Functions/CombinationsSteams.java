package Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationsSteams {

    private static class Employee {
        private String name;
        public int age;
        private String position;
        private int salary;

        public Employee(String name, int age, String position, int salary) {
            this.name = name;
            this.age = age;
            this.position = position;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Employee[] empArr = {
                new Employee("A", 23, "Boss", 10000),
                new Employee("B", 32, "Slave", 10000),
                new Employee("C", 23, "Boss", 10000),
                new Employee("D", 32, "Slave", 10000),
        };
        List<Employee> empCollection = new ArrayList<>(Arrays.asList(empArr));

        Integer totalSum = empCollection
                .stream()
                .filter((employee -> employee.position.equals("Boss")))
                .map(employee -> employee.salary)
                .reduce(0, (acc, x) -> acc +x);

        Long totalPart = empCollection
                .stream()
                .filter((employee -> employee.position.equals("Boss")))
                .collect(Collectors.counting());

        System.out.println(totalSum + " " + totalPart);
    }
}
