package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Read elements of the list");
        System.out.println(list);

        System.out.println("Throw ConcurrentModificationException when we try to modify the original list");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            list.add(40);
        }
    }
}
