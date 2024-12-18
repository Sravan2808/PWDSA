import java.util.*;
import java.io.*;
//Time Complexity : O(n)
//Space Complexity : O(1)

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                //Swap between arr[j] and arr[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={20,50,30,5,15,90,45,87,15};
        insertionSort(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }

}
