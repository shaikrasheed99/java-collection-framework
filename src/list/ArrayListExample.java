package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println("Add element to the list");
        list.add(10);
        System.out.println(list);

        System.out.println("All elements of the list");
        System.out.println(list);

        System.out.println("Update the second element");
        list.add(20);
        list.add(30);
        list.set(1, 15);
        System.out.println(list);

        System.out.println("Delete element from list");
        list.remove(1);
        System.out.println(list);

        System.out.println("Search element 30 in list");
        System.out.println(list.contains(30));

        System.out.println("Immutable list");
        List<Integer> immutableList = Collections.unmodifiableList(list);
        System.out.println(immutableList);

        System.out.println("Synchronized list");
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println(synchronizedList);

        System.out.println("Multi dimension ArrayList");
        int x_axis = 2, y_axis = 3;
        ArrayList<ArrayList<Integer>> space = new ArrayList<>(x_axis);
        for (int i = 0; i < x_axis; i++) {
            space.add(new ArrayList<>(y_axis));
        }
        space.get(0).add(1);
        space.get(0).add(2);
        space.get(0).add(3);
        space.get(1).add(4);
        space.get(1).add(5);
        space.get(1).add(6);
        System.out.println(space);
    }
}
