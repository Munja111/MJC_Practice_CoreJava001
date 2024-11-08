package October.Experiments.Collection;

import java.util.ArrayList;

class TestScenario {
    String name;
    int duration;

    TestScenario(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
}

public class ArrayListDemo02 {

    public static void main(String[] args) {
        ArrayList<TestScenario> scenarios = new ArrayList<>();

        scenarios.add(new TestScenario("Login", 30));
        scenarios.add(new TestScenario("Search", 45));

        for (TestScenario scenario : scenarios) {
            System.out.println("Scenario: " + scenario.name + ", Duration: " + scenario.duration + "s");
        }
    }

}
