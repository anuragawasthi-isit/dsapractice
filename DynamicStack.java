public class DynamicStack  {

    private int[] arr;
    private int top = -1;
    private static final int DEFAULT_CAPACITY = 5;
    private int currentcapacity =0;
    double loadfactor =0.75;
    public DynamicStack() {
        this.arr = new int[DEFAULT_CAPACITY];
    }

    public DynamicStack(int size) {
        this.arr = new int[size];
    }

    public void push(int num) throws Exception {
        if(isFull() || isThresholdreached()) {
            DoubleCapacity();
        }
        arr[++top] = num;
        currentcapacity++;
        System.out.println("Adding Item :" + num);
    }

    private boolean isThresholdreached() {
        int threshold = (int) (currentcapacity*loadfactor);
        if(threshold > DEFAULT_CAPACITY)
            return true;
        else
            return false;
    }

    private void DoubleCapacity() {
       int capacity = arr.length*2;
       int[] clonearray = new int[capacity];
       System.arraycopy(arr,0,clonearray,0,arr.length);


    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is Underflow");
        }
        System.out.println("Removed Item : " + arr[top]);
        currentcapacity--;
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    private boolean isFull() {
        return top == arr.length -1;
    }
    public void print() {
        if(top == -1) {
            System.out.println("No elements in the stack!!");
            return;
        }
        for(int i=top;i>=0;i--) {
            System.out.println(arr[i]);
        }
    }


}
