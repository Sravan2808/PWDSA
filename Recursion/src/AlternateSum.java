import java.util.*;
public class AlternateSum {
    public static int alternateSumSeries(int num){
        //1.Base case condition
        if(num==0){
            return 0;
        }
        //2.Recursive function call
        //2a.n is odd or even
        if(num %2 ==0){
            return alternateSumSeries(num-1)-num;
        }
        else{
            return alternateSumSeries(num-1)+num;
        }
    }
    //Driver code
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        int result = alternateSumSeries(num);
        System.out.println("The alternate sum series of a given number is : " +result);

    }
}
