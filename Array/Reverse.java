package Array;

public class Reverse {
    public static void main(String[] args)
    {
//        Swap two elements in a array
        int arr[]={2,4,6,8,10};
        int n=5;
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Reversed Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
