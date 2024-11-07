package October.Experiments.Interface;

import java.util.Scanner;

interface Client{
    public void input();
    public void output();
}

public class Developer implements Client {
    String emp_name;
    double salary;

    public void input(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter emp name: ");
        emp_name=scanner.next();

        System.out.println("Enter emp salary: ");
        salary=scanner.nextDouble();
    }
    public void output(){
        System.out.println("name: " +emp_name+ ",salary is: " +salary);
    }

    public static void main(String[] args) {
        Client c = new Developer();
        c.input();
        c.output();
    }


}
