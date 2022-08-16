package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>(list);

        System.out.println("Read elements of the list");
        System.out.println(integers);

        System.out.println("Will not throw any exception when we try to modify the original list");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value == 20) {
                list.add(40);
            }
            System.out.println(value);
        }

        System.out.println("Modified new original list");
        System.out.println(list);
    }
}
