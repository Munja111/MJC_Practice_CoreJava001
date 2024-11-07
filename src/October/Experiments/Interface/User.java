package October.Experiments.Interface;

public class User extends Bonus implements Course {

    @Override
    void mtb() {
        System.out.println("MTB");
    }

    @Override
    void sql() {
        System.out.println("SQL");
    }

    @Override
    public void atb() {
        System.out.println("ATB");
    }

    public static void main(String[] args) {
        User c= new User();
        c.atb();
        c.mtb();
        c.sql();
    }

}
