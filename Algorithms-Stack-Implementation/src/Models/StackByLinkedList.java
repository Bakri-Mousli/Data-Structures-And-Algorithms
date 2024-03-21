package Models;


public class StackByLinkedList {
    LinkedList linkedList = new LinkedList();
    public void push(int element){this.linkedList.addFromStart(element);}
    public int pop(){return  linkedList.isEmpty()?-1:linkedList.deleteFromStart();}
}
