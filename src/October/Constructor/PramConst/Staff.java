package October.Constructor.PramConst;

public class Staff {
    String name ;
    int age;
   // long m_number;
   // String orgName;

    Staff(String givenName,int givenAge){
        this.name=givenName;
        this.age=givenAge;
        System.out.println("Params constructor invoked");
    }

    public void userInfo(){
        System.out.println(name+" is "+age+" years old");
    }


}
