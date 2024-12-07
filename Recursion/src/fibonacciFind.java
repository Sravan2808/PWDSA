//Time Complexity : O(2^n)
//Space Complexity : O(n)
import java.util.*;
public class fibonacciFind {
    public static int fibonacciFinding(int n){
        int result =0;
        //base case condition
        if(n <= 1){
           return n;
        }
        //Recursive function call
        else{
            result = fibonacciFinding(n-1)+fibonacciFinding(n-2);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth number in fibonacci series");
        int n=sc.nextInt();
       int result=fibonacciFinding(n);
        System.out.println("The result of nth fibonacci number is : " +result);

    }
}
