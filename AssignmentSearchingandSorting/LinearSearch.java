import javax.swing.*;
//Time complexity is O(n);
//Space complexity is O(1);
import java.util.*;
public class LinearSearch {
    public static int linearSearch(int[] arr,int n,int target)
    {
        int result=-1;
        for(int i=0;i<n;i++) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int result=linearSearch(arr,n,target);
        if(result !=-1)
        {
            System.out.println("Element is found : " +result);
        }
        else
            System.out.println("Element is not found");
    }
}