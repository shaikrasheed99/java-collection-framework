package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Push 10, 20, 30, 40 elements into the stack");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        System.out.println("Peek element of the stack");
        System.out.println(stack.peek());

        System.out.println("Pop element from the stack");
        System.out.println(stack.pop());

        System.out.println("All elements of the stack");
        System.out.println(stack);

        System.out.println("Update 20 to 15 element of stack");
        stack.set(1, 15);
        System.out.println(stack);

        System.out.println("Delete element from stack");
        stack.remove(1);
        System.out.println(stack);

        System.out.println("Search element 30 in stack");
        System.out.println(stack.contains(30));
    }
}
