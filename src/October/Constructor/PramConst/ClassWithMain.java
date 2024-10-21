package October.Constructor.PramConst;

public class ClassWithMain {
    public static void main(String[] args) {

        Staff user1 = new Staff("Aryan",20);
        user1.userInfo();

        Staff user2 = new Staff("Aman",25);
        user2.userInfo();

        Staff user3 = new Staff("Bala",30);
        user3.userInfo();

    }
}
