package Models;

public class QueueByArray {
    private final int Max_Size ;
    private final int[] data ;
    int rear;//back ,tail ,end ,last
    int front;//first ,head ,begin ,start
    int length;
    public QueueByArray(int maxSize) {
        this.Max_Size = maxSize;
        this.data = new int[maxSize];
        this.rear = this.front = -1;
        this.length=0;
    }
    public boolean isEmpty(){
        return front == -1; // or length == 0
    }
    public boolean isFull(){
        return this.rear==this.Max_Size-1;// or length == Max_Size
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("The Queue is Full....");
            return;
        }
        if(isEmpty()){
            front = rear = 0;
            this.data[front] = element;
            return;
        }
        data[++rear] = element;
    }
    public int dequeue(){
        int element = -1;
        if(isEmpty()){
            System.out.println("Error: The Queue is already empty...");
            return element;
        }
        if(front == rear){
            element = this.data[front];
            front = rear = -1;
            return element;
        }
        element = this.data[front++];
        return element;
    }

    public int peek(){
        if(front!=-1)
            return this.data[front];
        else
            return -1;
    }
    public void printQueueElements() {
        if(isEmpty())
            System.out.println("The simple Queue is already empty...");

        System.out.println("Queue Elements is : ");
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i]);
            if (i != rear)
                System.out.print("-");
        }
        System.out.println();
    }

}
