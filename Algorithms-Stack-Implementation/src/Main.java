import Models.*;
public class Main {
    public static void main(String[] args) {
        StackByArray stack = new StackByArray(8);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.printStackElements();
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.search(40));
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}