package Programs;

import java.util.*;

public class MinMaxList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(50);
        arrayList.add(10);
        arrayList.add(80);
        arrayList.add(20);
        arrayList.add(40);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Minimum: " + Collections.min(arrayList));
        System.out.println("Maximum: " + Collections.max(arrayList));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(50);
        linkedList.add(10);
        linkedList.add(80);
        linkedList.add(20);
        linkedList.add(40);

        System.out.println("\nLinkedList: " + linkedList);
        System.out.println("Minimum: " + Collections.min(linkedList));
        System.out.println("Maximum: " + Collections.max(linkedList));

        Vector<Integer> vector = new Vector<>();
        vector.add(50);
        vector.add(10);
        vector.add(80);
        vector.add(20);
        vector.add(40);

        System.out.println("\nVector: " + vector);
        System.out.println("Minimum: " + Collections.min(vector));
        System.out.println("Maximum: " + Collections.max(vector));

        Stack<Integer> stack = new Stack<>();
        stack.push(50);
        stack.push(10);
        stack.push(80);
        stack.push(20);
        stack.push(40);

        System.out.println("\nStack: " + stack);
        System.out.println("Minimum: " + Collections.min(stack));
        System.out.println("Maximum: " + Collections.max(stack));
    }
}
