public class bubblesort {
    //swap adjacent elements
    public void bubbleSort(int[] arr){
        int temp;int n =arr.length;
        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;

                }


            }

        }
    }
    /* Prints the array */
    void print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        bubblesort ob = new bubblesort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.print(arr);
    }

}
