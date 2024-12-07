import java.util.*;

//1.Brute force Approach
// Time Complexity : O(m*n)
//Space Complexity : O(1)
//2.optimized approach
//TC :O(n)
//SC :O(1)
public class disPrimSecoDiag
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int m = sc.nextInt();
        System.out.print("Number of columns : ");
        int n = sc.nextInt();
        /*
        int arr[][] = new int[m][n];
        System.out.println("Enter the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j) {
                    System.out.print(arr[i][j]+" ");
                }
                if(i+j==n-1)
                {
                    System.out.print(arr[i][j] +"  ");
                }
            }
        }
*/
//        Optimized Code using only one loop and not printing middle value
//        TC:O(n2)
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<m;i++)
        {
            //primary diagonal elements
            System.out.print(arr[i][i] +" ");
            //secondary diagonal elements
            //below condition to avoid middle element
            if(i!=(n-1-i))
                System.out.print(arr[i][n-1-i] + " ");
        }


    }
}
