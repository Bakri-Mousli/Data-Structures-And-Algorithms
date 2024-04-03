import Models.QueueByArray;
import Models.QueueByLinkedList;

public class Main {
    public static void main(String[] args) {
        QueueByArray queueByArray = new QueueByArray(5);
        System.out.println("Simple Queue Implemented By Array  : ");
        queueByArray.enqueue(10);
        queueByArray.enqueue(20);
        queueByArray.enqueue(30);
        queueByArray.enqueue(40);
        queueByArray.enqueue(50);

        queueByArray.printQueueElements();
        queueByArray.dequeue();
        queueByArray.dequeue();
        queueByArray.printQueueElements();

        queueByArray.enqueue(60);
        queueByArray.enqueue(70);
        queueByArray.printQueueElements();
        System.out.println("==============================================");
        QueueByLinkedList queueByLinkedList = new QueueByLinkedList();

        System.out.println("Queue Implemented By Linked List  : ");
        queueByLinkedList.enqueue(10);
        queueByLinkedList.enqueue(20);
        queueByLinkedList.enqueue(30);
        queueByLinkedList.enqueue(40);
        queueByLinkedList.enqueue(50);
        queueByLinkedList.enqueue(60);

        queueByLinkedList.printQueueElements();
        queueByLinkedList.dequeue();
        queueByLinkedList.dequeue();
        queueByLinkedList.enqueue(70);
        queueByLinkedList.enqueue(80);

        queueByLinkedList.printQueueElements();
        System.out.println(queueByLinkedList.peek());
    }
}
