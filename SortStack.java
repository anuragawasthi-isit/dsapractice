import java.util.Stack;

public class SortStack {

    static void sortStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int num = s.pop();
        sortStack(s);
        pushToSortedStack(num, s);
    }

    static void pushToSortedStack(int num, Stack<Integer> s) {
        if(s.empty() || s.peek().compareTo(num) != 1) {
            s.push(num);
            return;
        }

        int top = s.pop();
        pushToSortedStack(num, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(9);
        s.push(7);
        s.push(6);
        s.push(5);
        s.push(1);

        System.out.println("Before Sorting : " + s.toString());
        sortStack(s);
        System.out.println("After After : " + s.toString());
    }

}