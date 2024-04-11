package Models;

public class QueueCircularByArray {
    int maxSize;
    int[] data;
    int front , rear;
    public QueueCircularByArray(int maxSize) {
        rear = -1;
        front = -1;
        this.data = new int[maxSize];
        this.maxSize = maxSize;
    }

    boolean isEmpty() {
        return front == -1;
    }
    boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    void enqueue(int element){
        if (isFull()){
            System.out.println("Error: queue is full");
            return;
        }
        if (isEmpty()){
            front = rear = 0;
            data[rear] = element;
            return;
        }
        rear = (rear + 1) % maxSize;
        data[rear] = element;
    }
    int dequeue(){
        int element;
        if (isEmpty()){
            System.out.println("Error: Queue is already empty");
            return -1;
        }
        if(front == rear){
            element = data[front];
            front = rear = -1;
            return element;
        }
        element = data[front];
        front = (front + 1) % maxSize;
        return element;
    }

    public  void  peek(){
        System.out.println("the peek is"+ data[front]);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Error: Queue is empty");
            return;
        }
        System.out.print("Circular Queue elements: ");
        int count = (rear - front + maxSize) % maxSize + 1;
        for (int i = 0; i < count; i++) {
            int index = (front + i) % maxSize;
            System.out.print(data[index] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        QueueCircularByArray queues = new QueueCircularByArray(5);
        queues.enqueue(10);
        queues.enqueue(20);
        queues.enqueue(30);
        queues.enqueue(40);
        queues.enqueue(50);
        queues.enqueue(60);
        queues.display();
        queues.dequeue();
        queues.dequeue();
        queues.display();
        queues.enqueue(60);
        queues.enqueue(70);
        queues.display();
    }
}

