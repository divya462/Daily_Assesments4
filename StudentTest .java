/* 2) Write a OOP  that would print the information (name, year of joining, salary, address)
of three students by creating a class named Student. The output should be as follows: Take input from user for the same.
Name Year of joining Address
Robert 1994 64C- WallsStreet
Sam 2000 68D- WallsStreet
John 1999 26B- WallsStreet
  */
import java.util.Scanner;

class Student {
    private String name;
    private int yearOfJoining;
    private String address;

    public Student(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void display() {
        System.out.printf("%-10s %-15d %-20s\n", name, yearOfJoining, address);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details of Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Year of Joining: ");
            int year = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.print("Address: ");
            String address = sc.nextLine();

            students[i] = new Student(name, year, address);
        }

        System.out.printf("%-10s %-15s %-20s\n", "Name", "Year of Joining", "Address");
        for (Student s : students) {
            s.display();
        }
    }
}
