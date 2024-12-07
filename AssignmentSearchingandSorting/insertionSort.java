import java.util.Arrays;

public class insertionSort {
    public static void insertionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int j=i;
                while(j>0 && arr[j]>arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            }
        }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        insertionSort(arr);
        System.out.println("Descending order by using selection sort" + Arrays.toString(arr));
    }
}
