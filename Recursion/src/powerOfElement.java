//Approach : Recursion
//Time Complexity:O(log b)
//Space Complexity : O(log b)

import java.io.*;
import java.util.*;
    public class powerOfElement {
        //Function definition
        public static long powerFind(long a,long b){
        //base case condition
        long mid=0,result=0, finalresult=0;
        if(b==1){
            return a;
        }
        else{
            mid=b/2;
            //recursive function call
            result=powerFind(a,mid);
            finalresult=result*result;
            if(b%2==0){
                return finalresult;
            }
            else{
                return a*finalresult;
            }
        }
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        long a=sc.nextInt();
        long b= sc.nextInt();

        long result=powerFind(a,b);
        System.out.println("a^b is : "+result);
    }
}
