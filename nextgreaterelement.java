import java.util.Stack;

public class nextgreaterelement {

    static void ngelement(int[] a){
 int element,next;
Stack<Integer> aa = new Stack<Integer>();
aa.push(a[0]);

for(int i=1;i<a.length;i++){

    next = a[i];

    if (aa.isEmpty() == false){

        // if stack is not empty, then
        // pop an element from stack
        element = aa.pop();

         /* If the popped element is smaller than
                   next, then a) print the pair b) keep
                   popping while elements are smaller and
                   stack is not empty */
        while (element < next)
        {
            System.out.println(element + " --> " + next);
            if (aa.isEmpty() == true)
                break;
            element = aa.pop();
        }
          /* If element is greater than next, then
                   push the element back */
        if (element > next)
            aa.push(element);
    }

     /* push next to stack so that we can find next
               greater for it */
    aa.push(next);

}
/* After iterating over the loop, the remaining
           elements in stack do not have the next greater
           element, so print -1 for them */
        while (aa.isEmpty() == false)
        {
            element = aa.pop();
            next = -1;
            System.out.println(element + " -- " + next);
        }

    }



    public static void main(String[] args)
    {
        int arr[] = { 4, 5, 2, 25, 7, 32, 8, 6 };
        int n = arr.length;
        ngelement(arr);
    }
}
