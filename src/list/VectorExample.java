package list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();

        System.out.println("Add 30, 20, 10, 40 elements to the list");
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(40);

        System.out.println("Read all the elements of list");
        System.out.println(list);

        System.out.println("Update 20 to 15 in list");
        list.set(1, 15);
        System.out.println(list);

        System.out.println("Delete 10 element from list");
        list.remove(Integer.valueOf(10));
        System.out.println(list);

        System.out.println("Sort the list");
        Collections.sort(list);
        System.out.println(list);
    }
}
