package October.Experiments.Interface;


import java.util.Scanner;

// First interface
interface Tester {
    void input();
    void output();
}

// Second interface
interface Project {
    void projectDetails();
}

// Developer class implementing multiple interfaces
public class Manager implements Tester, Project {
    String emp_name;
    double salary;
    String projectName;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter emp name: ");
        emp_name = scanner.next();

        System.out.println("Enter emp salary: ");
        salary = scanner.nextDouble();

        System.out.println("Enter project name: ");
        projectName = scanner.next();
    }

    public void output() {
        System.out.println("Name: " + emp_name + ", Salary: " + salary);
    }

    public void projectDetails() {
        System.out.println("Project: " + projectName);
    }

    public static void main(String[] args) {
        Manager mn = new Manager();
        mn.input();
        mn.output();
        mn.projectDetails();  // This should work
    }
}

