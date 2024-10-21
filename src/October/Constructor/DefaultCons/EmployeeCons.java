package October.Constructor.DefaultCons;

public class EmployeeCons {
// Instance variables
   // String name = "Martin";
   String name ;
    boolean isPermanent;
    int age;
    float salary;
    long m_number;
    String orgName;

    // Default constructor
    EmployeeCons(){
        System.out.println("Default - Constructor");
        orgName ="Automation";
        name="Reds";
        age=15;
    }

    //methods/functions
    public void readData()
    {
        System.out.println("Data is: "+name+" and"+age);

    }





}
