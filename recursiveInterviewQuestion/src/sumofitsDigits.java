import java.util.*;
public class sumofitsDigits {
    public static int sumofitsDigits(int n){
        //base case condition
        if(n<1){//we can n==0;
            return n;//return 0;
        }
        else{
          return n%10+sumofitsDigits(n/10);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofitsDigits(n));
    }
}
