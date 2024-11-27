package November.Experiments_Nov;

public class Exp002 {
    public static void main(String[] args) {

    }
}

class Parent{
    int gold =10;

    Parent(){
        System.out.println("DC Parent constructor");
    }

    Parent(int gold){

    }

    void nom(){
        System.out.println("Parent method called");
    }
}

class Child{
    int gold =12;

    Child(){
        System.out.println("DC child constructor");
    }

    void nom(){
        System.out.println("Child method called");
    }
}
