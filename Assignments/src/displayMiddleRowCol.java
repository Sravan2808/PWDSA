import java.util.Scanner;

public class displayMiddleRowCol
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int m = sc.nextInt();
        System.out.print("Number of columns : ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //middle column values
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i][n/2] + " ");
            }
        //mid row and avoid middle element twice printing
        for(int j=0;j<n;j++)
        {
            if(j==n/2)
                continue;
            System.out.print(arr[m/2][j]+" ");
        }
    }
}
