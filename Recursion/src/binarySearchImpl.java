import java.util.*;
public class binarySearchImpl {
    public static int binarySearchRec(int arr[],int low,int high,int x){
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            //Traverse towards the right side of an array
            else if(arr[mid]<x){
                return binarySearchRec(arr,mid+1,high,x);
            }
            else{
                return binarySearchRec(arr,low,mid-1,x);
            }
        }
        return result ;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,10,15,19,25,29,31,39,47};
        System.out.println("Enter the target value to be searched");
        int x= sc.nextInt();
        int low=0;
        int high=arr.length-1;
        int result=binarySearchRec(arr,low,high,x);
        if(result==-1){
            System.out.println("Element is not found in the array");
        }
        else{
            System.out.println("Element is available at the index :  " +result);
        }
    }
}
