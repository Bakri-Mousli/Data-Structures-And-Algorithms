package Models;
public class StackByArray {
    private final int MAX_SIZE ;
    private int top;
    private final int[] data;

    public StackByArray(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.data = new int[MAX_SIZE];
        this.top = -1;
    }
    public boolean isEmpty(){return top != MAX_SIZE-1;}
    public boolean isFull(){return  top == MAX_SIZE-1;}
    public void push(int element){
        if(isFull())
            System.out.println("The Stack is full... ");
        else
            this.data[++top] = element;
    }
    public int pop(){
        if(top != -1 ){
            int x = data[top];
            top--;
            return x;
        }
        else
            System.out.println("The Stack is Empty...");
        return 0;
    }
    public int peek(){
        if(this.top > -1)
            return this.data[top];
        return -1;
    }
    public void printStackElements(){
        System.out.println("The Stack Element is : ");
        for (int i = top; i >= 0 ; i--) {
            System.out.print(this.data[i]+"  ");
        }
        System.out.println();
    }
    public int search(int element){
        for (int i = 0; i < this.data.length; i++)
            if(this.data[i] == element)
                return i;

        return -1;
    }
}
