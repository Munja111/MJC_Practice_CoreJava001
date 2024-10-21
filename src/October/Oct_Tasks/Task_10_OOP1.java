package October.Oct_Tasks;

public class Task_10_OOP1 {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name ="Admin";
        System.out.println(emp.name);
        emp.age =28;
        System.out.println(emp.age);
        emp.m_number =9874563210D;
        System.out.println(emp.m_number);
        emp.salary=50000;
        System.out.println(emp.salary);

        emp.walk();
        emp.eat();
        emp.sleep();
    }
}
