import java.util.Scanner;
//Tc:O(logn)
//SC:O(1)
public class setBits {
    public static int countOf1bits(int num)
    {
        int count=0;
        while(num>0)
        {
            count += (num&1);
            num>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int count=countOf1bits(num);
        System.out.println("The number of 1's : "+count);

    }
}
