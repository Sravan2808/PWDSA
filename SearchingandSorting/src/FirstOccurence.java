import java.util.*;
//Time Complexity : O(logN)
//Space Complexity : O(1)
public class FirstOccurence {
    public static int firstOccurence(int arr[],int target){
        int low=0,high=arr.length-1;
        int result=-1;
        while(low<=high){
            //To avoid the overflow
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                //we want lower bound of an element,so we need to tranverse towards left side of an array
                high = mid-1;

            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n= sc.nextInt();
        System.out.println("Enter the elements in an array:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target value that you want to search for:");
        int target = sc.nextInt();

        //Function Calling
        int result=firstOccurence(arr,target);
        if(result!=-1){
            System.out.println("First Occurnce of an element at the location : "+result);
        }
        else{
            System.out.println("Element is not found");
        }
    }
}
