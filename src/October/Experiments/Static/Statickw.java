package October.Experiments.Static;

public class Statickw {
    int id;
    String name;
    static String org ="AM";

    public Statickw(int id, String name) {
        this.id = id;
        this.name = name;

    }

    void display() {
        System.out.println("id:" +id+ ",name:"+name+ ",org:"+org);
        System.out.println(id+" "+name+" "+org);
    }


    public static void main(String[] args) {
        Statickw sk = new Statickw(120,"Topan");
        sk.display();

        Statickw sk1=new Statickw(15,"Chetan");
        sk1.display();
        Statickw sk2=new Statickw(345,"Kama");
        sk2.display();
        Statickw sk3=new Statickw(7266,"Mahesh");
        sk3.display();
    }
}
