public class ReverseArray {

public static void reverseArray(int[] arr){
    int low=0;int high =arr.length-1;
    int temp;
    while(low<high)
    {temp =arr[low];
    arr[low]=arr[high];
    arr[high]=temp;
low++;
high--;
    }
    /*printing the reversed array*/
    System.out.println("Reversed array is: \n");
    for (int k = 0; k <arr.length; k++) {
        System.out.println(arr[k]);
    }
}
    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverseArray(arr);
    }
}
