package Models;
public class LinkedList {
    Node first;
    boolean isEmpty() {
        if (first == null)
            return true;
        else
            return false;
    }
    public void addright(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty())
        {
            first = newNode;
        }
        else {
            Node current = first;

            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void addLeft(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty())
        {
            first = newNode;
        }
        else {
        newNode.next=first;
        first=newNode;
        }
    }


    public void display()
    {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }


    public int size() {
        int count = 0;

        Node current = first;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    public Boolean search(int data) {
        Node current = first;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void get (int index) {
        boolean found = true;
        Node current = first;
        for (int i = 0; i < index  ; i++)
        {
            current = current.next;
            if (current==null)
            {
                found = false;
                System.out.println("not found");
                break;
            }
        }
        if (found)System.out.println(current.data);
    }
    public int deleteFirst(){
        int data = first.data;
        first = first.next;
        return data;
    }


}
