import java.util.Scanner;

public class sumOfDigits {
    //function definition
    public static int sumOfDigits(int num){
        //1.base Case Condition
        if(num==0){
            return 0;
        }
        //2.Recursive function call
        return (num%10)+sumOfDigits(num/10);
    }
    //Drive code
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result=sumOfDigits(num);
        System.out.println("Sum of the digits is : "+result);
    }
}
