import Models.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Call method isEmpty : "+linkedList.isEmpty());// this call for test of methode
        linkedList.add(100);// add first node
        linkedList.add(200);// add second node
        linkedList.add(300);// add third node
        linkedList.add(400);// add fourth node
        linkedList.add(250,2);// add node at index = 2
        linkedList.display();// show all nodes in LinkedList Data structures
        linkedList.get(2);// return node at index = 2
        System.out.println("Size of Linked List is : "+linkedList.size());
        // this will be return size of Linked List
    }
}