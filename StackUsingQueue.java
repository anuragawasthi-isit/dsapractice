import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    static Queue<Integer> queue1,queue2;

    static int top(){
        return queue1.peek();
    }

    static int Size(){
        return queue1.size();
    }
    static int pop(){

        return queue1.remove();
    }
//here we made the push operation costly
    void push(int x){


        while(queue1.isEmpty() == false){
            queue2.add(queue1.peek());
            queue1.remove();

        }
        queue1.add(x);
        while(queue2.isEmpty() == false){
            queue1.add(queue2.peek());
            queue2.remove();

        }
    }
}
