package Array;
import java.io.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Looping2D {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in an array");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns in an array");
        int n=sc.nextInt();
//        Declaration of 2d Array
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= 10;
            }
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}
