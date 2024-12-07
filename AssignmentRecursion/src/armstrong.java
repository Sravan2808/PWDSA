import java.util.Scanner;

public class armstrong {

    public static int Armstrong(int n,int a) {
        //        declaring result variable
        int x;

//        Base case condition
        if (n != 0) {
             x= n % 10;
//        updating adding the sum
            a=a+x*x*x;
//        it comes as the quoitent number
            return Armstrong(n / 10,a);
        }
        return a;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result= Armstrong(n,0);
        System.out.println("The Armstrong values is : "+result);
        if (result==n){
            System.out.println("yes");
        }
        else System.out.println("No");
    }
}