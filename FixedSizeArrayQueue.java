public class FixedSizeArrayQueue {

    private int[] queueRep;
    private int size, front, cap;
    public FixedSizeArrayQueue (int c){
        queueRep = new int [c];
        size  = 0; front = 0; cap  = c;
    }
    boolean isEmpty(){
        return size ==0;
    }
    boolean isFull(){
        return size ==cap;
    }
    int getRear(){

        if(isEmpty())
            return -1;
        else
            return (front+size-1)%cap;
    }
    void enQueue(int x){
        if(isFull())
            return;
        int rear = getRear();
        rear=(rear+1)%cap;
        queueRep[rear]=x;
        size++;
    }
void deQueue(){
        if(isEmpty())
            return;

            System.out.println(queueRep[front]);
            front = (front+1)%cap;
            size--;

}
    public static void main(String[] args)
    {
        FixedSizeArrayQueue arrayQueue = new FixedSizeArrayQueue(9);
        arrayQueue.enQueue(10);
        arrayQueue.enQueue(20);
        arrayQueue.enQueue(30);
        arrayQueue.enQueue(40);
        arrayQueue.enQueue(50);
        arrayQueue.enQueue(60);
        arrayQueue.enQueue(70);
        arrayQueue.enQueue(80);
        arrayQueue.enQueue(90);
        arrayQueue.deQueue();
    }
}
