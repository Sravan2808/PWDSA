import java.util.Scanner;
//tc:O(logn)
//sc:O(1)
public class LastOccurence {
    public static int lastOccurence(int[] arr,int low,int high,int target) {
        int result=-1;
        int count=0;
        while(low <= high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                result=mid;
                low=mid+1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return result;
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=lastOccurence(arr,0,n-1,target);
        if (result!=-1)
            System.out.println("The last Occurence of an given element is " +result+" ," );

    }
}
