package Models;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedList {
    Node head;

    // check if LinkedList is Empty
    public boolean isEmpty(){
        return this.head == null;
    }

    // print all elements of LinkedList
    public void display(){
        Node tempNode = this.head;
        System.out.println("This is all Content of Linked List.. : ");
        while (tempNode!=null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }

    //return size of LinkedList
    public int size(){
        int countOfNodes = 0;
        for (Node current = this.head; current != null; current=current.next)
            countOfNodes += 1;
        return countOfNodes;
    }

    // print data node at specify index
    public void get(int index){
        boolean found = true;
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
            if(current == null){
                found = false;
                System.out.println("Not Found...");
                break;
            }
        }
        if (found)
            System.out.println("Found Node and Data... :"+current.data);
    }

    // Pass data to add node at end of LinkedList
    public void add(int data){
        Node node = new Node(data,null);
        if(this.isEmpty())
            this.head = node;
        else{
            Node current = head;
            while (current.next !=null)
                current=current.next;
            current.next = node;
        }
    }

    public void addFromStart(int data){
        Node temp = new Node(data,null);
        temp.next = head;
        head = temp;
    }

    // Pass data to add node at specify index in LinkedList
    public void add(int data, int index) {
        Node newNode = new Node(data, null);

        // If index is 0, insert at the beginning
        if (index == 0) {
            newNode.next = head;
            head = newNode; // Update head
        } else {
            // Traverse the list to find the insertion point
            Node current = head;
            int currentIndex = 0;
            // Stop at the node just before the insertion point
            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }

            // If index is out of range, print error message and return
            if (current == null) {
                System.out.println("Index out of range. Please enter a valid index.");
                return;
            }

            // Insert the new node into the list
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void addUsingForLoop(int data, int index) {
        // Create a new node with the given data
        Node newNode = new Node(data, null);

        // If index is 0, insert at the beginning
        if (index == 0) {
            newNode.next = head;
            head = newNode; // Update head
            return;
        }

        // Use a pointer to traverse the list to the node just before the insertion point
        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        // If current is null, index is out of range
        if (current == null) {
            System.out.println("Index out of range. Please enter a valid index.");
            return;
        }

        // Insert the new node into the list
        newNode.next = current.next;
        current.next = newNode;
    }

    // Pass data to delete node that equal to data  LinkedList
    public void delete(int data){
        Node previous = null,current = this.head;
        if (current != null && current.data == data) {
            head = current.next;
            return;
        }
        while (current != null && current.data !=data){
            previous = current;
            current = current.next;
        }
        if(current == null)
            return;
        previous.next = current.next;
    }
    public void deleteFromStart(){
        this.head = head.next;
    }
    public void deleteFromEnd(){
        Node current = this.head;
        while (current.next.next != null){
            current= current.next;
        }
        current.next = null;
    }
}
