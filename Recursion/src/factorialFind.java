//TimeComplexity : O(n)
//SpaceComplexity : O(n)
import java.util.*;
import java.io.*;
public class factorialFind {
    //function definition
    public static int factorialFinding(int n){
        int result = 0;
        //Base case Condition
        if(n==0 || n==1){
            return 1;
        }
        //Recursive calls
        else{
            result = n*factorialFinding(n-1);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find out :");
        int n=sc.nextInt();
        //Function calling
        int result = factorialFinding(n);
        System.out.println("Factorial of a given number entered by the user is :"+result);

    }
}
