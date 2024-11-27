package November.Experiments_Nov_GetterSetter;

public class Student {
   private String name;
   private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber(int i) {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }

}
