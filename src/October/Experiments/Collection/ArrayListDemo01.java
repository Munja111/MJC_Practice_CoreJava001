package October.Experiments.Collection;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("chrome");
        arrayList.add("firefox");
        arrayList.add("edge");

        for(String browser:arrayList){
            System.out.println(browser);
        }
    }
}
