import java.util.Scanner;

class Employee {
    private double salary;
    private int workHours;

    // Method to take input
    public void getInfo(double salary, int workHours) {
        this.salary = salary;
        this.workHours = workHours;
    }

    // Method to add $10 if salary < 500
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    // Method to add $5 if work hours > 6
    public void addWork() {
        if (workHours > 6) {
            salary += 5;
        }
    }

    public double getFinalSalary() {
        return salary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter work hours per day: ");
        int hours = sc.nextInt();

        emp.getInfo(salary, hours);
        emp.addSal();
        emp.addWork();

        System.out.println("Final Salary: $" + emp.getFinalSalary());
    }
}
