package Array;

import java.util.Scanner;

//Time Complexity : O(n^2)
//Space Complexity : O(1)
public class DuplicateArray {
    public static void main(String[] args)
    {
       int arr[]={1,2,2,4,5};
       int n = arr.length;
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        System.out.println("Entering the arrray elements");
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//        Time Complexity : O(n^2)
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Element : " + arr[i]);
                }
            }
        }
    }
}
