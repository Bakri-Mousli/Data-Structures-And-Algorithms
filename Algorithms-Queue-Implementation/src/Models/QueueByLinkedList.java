package Models;
public class QueueByLinkedList {
    private LinkedList linkedList = new LinkedList();
    public void enqueue(int element){
        this.linkedList.addright(element);
    }
    public int dequeue(){
        int element = -1;
        if(this.linkedList.isEmpty()){
            System.out.println("Error : The Queue is already empty ...");
            return element;
        }
        element = this.linkedList.deleteFirst();
        return element;
    }
    public int peek(){
        return this.linkedList.isEmpty()? -1 : this.linkedList.first.data;
    }
    public void printQueueElements(){
        if(this.linkedList.isEmpty())
            System.out.println("The Queue is already empty...");
        else {
            Node current = this.linkedList.first;
            System.out.println("Queue Elements is : ");
            while (current!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
