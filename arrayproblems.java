import java.util.Stack;

public class arrayproblems {

    static void invertBits(int num)
    {
        // calculating number of
        // bits in the number
        int x = (int)(Math.log(num) /
                Math.log(2)) + 1;

        // Inverting the
        // bits one by one
        for (int i = 0; i < x; i++)
            num = (num ^ (1 << i));

        System.out.println(num);
    }

    static int[] findMissingAndDuplicate(int[] arr, int n) {

        int[] result = new int[2];
        for(int i=0;i<n;i++)
        {
            int val = Math.abs(arr[i]);
            if(arr[val - 1] < 0)
            {
                result[0] = val;
            }
            arr[val - 1] = -1 * arr[val -1];
        }

        for(int i=0;i<n;i++) {
            if(arr[i] > 0 && i!= result[0]-1)
            {
                result[1] = i+1;
            }
        }
        return result;
    }

}
