import java.util.Scanner;

public class maxElement2D
{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int m = sc.nextInt();
        System.out.print("Number of columns : ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                max=Math.max(max,arr[i][j]);
            }

        }
        System.out.println("The maximum number in the array is : "+max);
    }
}
