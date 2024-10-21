package October.Constructor.DefaultCons;

public class MainMethod_Const {
    public static void main(String[] args) {

        EmployeeCons emp1= new EmployeeCons();
      //  emp1.name="TestUser1";
        System.out.println(emp1.name);

        EmployeeCons emp2= new EmployeeCons();
        //  emp1.name="TestUser2";
        System.out.println(emp2.name);

        System.out.println(emp1.isPermanent);
        System.out.println(emp1.orgName);

        emp1.readData();


    }
}
