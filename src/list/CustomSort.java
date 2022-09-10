package list;

import java.util.Arrays;

public class CustomSort {
    public static void main(String[] args) {
        int[][] values = {{7, 4}, {6, 9}, {7, 8}, {10, 9}, {7, 6}, {10, 5}, {10, 10}};

        System.out.println("Original matrix: ");
        System.out.println(Arrays.deepToString(values));

        int[][] temp = values.clone();
        System.out.println("Sort as per the first column in increasing order: ");
        Arrays.sort(temp, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(temp));

        temp = values.clone();
        System.out.println("Sort as per the first column in decreasing order: ");
        Arrays.sort(temp, (a, b) -> b[0] - a[0]);
        System.out.println(Arrays.deepToString(temp));

        temp = values.clone();
        System.out.println("Sort as per the first column in increasing order, if rows are same sort in decreasing order as per second column: ");
        Arrays.sort(temp, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        System.out.println(Arrays.deepToString(temp));
    }
}
