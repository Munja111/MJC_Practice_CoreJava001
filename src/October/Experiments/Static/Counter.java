package October.Experiments.Static;

public class Counter {
    static int count =0;

    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
            Counter co = new Counter();
            Counter co1 = new Counter();
            Counter co2 = new Counter();

    }
}
