package October.Experiments.Collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(70);
        linkedList.add(71);
        linkedList.addFirst(50);
        linkedList.addLast(72);

        System.out.println("First Element is "+linkedList.getFirst());
        System.out.println("Last Element is "+linkedList.getLast());



    }
}
