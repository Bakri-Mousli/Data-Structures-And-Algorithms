import Models.*;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // this for test and execute operations on the stack by array
        StackByArray stackByArray = new StackByArray(8);
        stackByArray.push(10);
        stackByArray.push(20);
        stackByArray.push(30);
        stackByArray.push(40);
        stackByArray.push(50);

        stackByArray.printStackElements();
        System.out.println(stackByArray.isEmpty());
        System.out.println(stackByArray.pop());
        System.out.println(stackByArray.search(40));
        System.out.println(stackByArray.peek());

        System.out.println("===============================");

        // this for test and execute operations on the stack by linked list
        StackByLinkedList stackByLinkedList= new StackByLinkedList();
        stackByLinkedList.push(10);
        stackByLinkedList.push(20);
        stackByLinkedList.push(30);
        stackByLinkedList.push(40);
        stackByLinkedList.push(50);

        stackByLinkedList.printStackElements();
        System.out.println(stackByLinkedList.isEmpty());
        System.out.println(stackByLinkedList.pop());
        System.out.println(stackByLinkedList.search(40));
        System.out.println(stackByLinkedList.peek());

        System.out.println("===============================");

        // this for test and execute operations on the stack built in data structures
        Stack<String> stack = new Stack<>();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        String Element = stack.pop();
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);
    }
}