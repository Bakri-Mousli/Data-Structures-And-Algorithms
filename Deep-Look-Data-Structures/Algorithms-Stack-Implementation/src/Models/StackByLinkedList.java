package Models;


import javax.swing.text.StyledEditorKit;

public class StackByLinkedList {
    LinkedList linkedList = new LinkedList();
    public Boolean isEmpty(){return this.linkedList.isEmpty(); }
    public void push(int element){this.linkedList.addToLeft(element);}
    public int pop(){return  linkedList.isEmpty()?-1:linkedList.deleteFirst();}
    public int peek(){
        if(this.linkedList.isEmpty())
            return -1;
        else
            return this.linkedList.first.data;
    }
    public void printStackElements(){
        Node current=linkedList.first;
        System.out.println("The Stack Elements is : ");
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int search(int element){
        Node current = linkedList.first;
        int count = 0;
        while (current != null){
            if(current.data == element)
                return count+1;
            current = current.next;
            count++;
        }
        return -1;
    }
}
