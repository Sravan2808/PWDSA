import java.util.*;
public class countWays {
    //function definition
    public static int countFind(int n){
        //Base Case Condition
        if(n<=1){
            return n;
        }
        else{
            return countFind(n-1) + countFind(n-2);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs");
        int n=sc.nextInt();

        //Function calling
        int result = countFind(n+1);
        System.out.println("The number of ways are : " + result);

    }
}
