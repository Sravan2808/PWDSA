//Time Complexity : O(n*2)
//space complexity : O(1)
//Bubble Sort is a Stable sort
import java.util.*;
import java.io.*;
public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        //Write your code here
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap two elements in an array
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
//        int arr[] = {20, 50, 30, 90, 5, 15};
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

        bubbleSort(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
