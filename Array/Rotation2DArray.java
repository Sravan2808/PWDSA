package Array;
import java.io.*;
import java.util.*;
// Time Complexity: O(n^2)
// Space Complexity: O(1)
public class Rotation2DArray {
    public static void rotatedMatrix(int[][] arr) {
        //Write your code here
        //Step 1: Transpose the 2D Array
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
//        Step 2: Swap the left and right side columns
        for(int i=0;i<arr.length;i++)
        {
            int li=0;
            int ri = arr.length-1;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        //Function Calling
        rotatedMatrix(arr);
//Display
//        for (var mat:arr) {
//            System.out.println(Arrays.toString(mat));
//        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}


