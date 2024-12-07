import java.util.*;
import java.io.*;
//Time Complexity : O(n*2)
//Space Complexity : O(1)
public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i< arr.length;i++){
           //min_idx is responsible to store the index of minimum value in every iteration
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j] < arr[min_idx]){
                   min_idx = j;
               }
            }
            if(min_idx!=i){
               //Swap is required
               int temp=arr[min_idx];
               arr[min_idx]=arr[i];
               arr[i]=temp;
            }

        }


    }
    public static void main(String[] args){
        int arr[]={50,25,38,44,99,16,11,21};
        selectionSort(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
