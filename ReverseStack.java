import java.util.Stack;

public class ReverseStack {
//recursive approach
    void Reverse(Stack<Integer> s){

        if(s.isEmpty())
            return;

        int popitem =s.pop();
        Reverse(s);
        insertatbottom(s,popitem);
    }

    private void insertatbottom(Stack<Integer> s,int popitm) {

        if(s.isEmpty())
            s.push(popitm);

        int x =s.pop();
        insertatbottom(s,x);
    }
}
