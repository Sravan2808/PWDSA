import java.util.*;
//Time Complexity : O(m*n)
//Space Complexity : O(1)
public class secondaryDiagonal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows");
        int m = sc.nextInt();
        System.out.println("Number of columns");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                if((i+j)<n-1)
                    System.out.println("The Elements are : "+arr[i][j]);
            }
        }

    }
}
