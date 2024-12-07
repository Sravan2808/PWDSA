import java.util.Arrays;

public class selectionSort {
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int max_idx=i;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j] > arr[max_idx])
                    max_idx=j;
            }
            if(max_idx!=i)
            {
                int temp=arr[max_idx];
                arr[max_idx]=arr[i];
                arr[i]=temp;
            }
        }

    }
    public static void main(String[] args)
    {
        int arr[]={3,5,1,6,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
