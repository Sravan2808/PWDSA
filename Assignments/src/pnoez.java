import java.util.Scanner;
//Time Complexity : O(m*n)
//Space Complexity : O(1)
public class pnoez
{
    public static void main(String[] args) {
//        Taken the input of m and n followed by m*n array elements from the user
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
        //count the postives,negatives,even,odd,zeros
        int postive=0,negative=0,even=0,odd=0,zeros=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                //postive element
                if(arr[i][j]>0)
                {
                    postive++;
                }
                //negative element
                if (arr[i][j] <0)
                {
                   negative++;
                }
                //Even element
                if(arr[i][j] % 2 == 0) {
                    even++;
                }
                //Odd Element
                if(arr[i][j] %2 != 0)
                {
                    odd++;
                }
                if(arr[i][j]==0) {
                    zeros++;
                }
            }
        }
        System.out.println( "Number of positive elements : " +postive);
        System.out.println("Number of negative elements : "+negative);
        System.out.println("Number of Even elements : "+even);
        System.out.println("Number of odd elements :" +odd);
        System.out.println("Number of zero elements: "+zeros);

    }
}
