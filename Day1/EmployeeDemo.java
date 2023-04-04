import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee employee) {
        return employee.name.compareTo(employee.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        } else if (e1.getSalary() < e2.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            employee.add(new Employee(sc.next(), sc.nextDouble()));
        }

        Collections.sort(employee, new SalaryComparator());
        for (Employee emp : employee) {
            System.out.println(emp.getName() + " " + emp.getSalary());
        }

        Collections.sort(employee);
        for (Employee emp : employee) {
            System.out.println(emp.getName() + " " + emp.getSalary());
        }
    }
}