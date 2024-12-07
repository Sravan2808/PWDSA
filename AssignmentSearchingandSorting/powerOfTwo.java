import java.util.Scanner;

public class powerOfTwo {
    public static boolean checkPoweofTwo(int num)
    {
       if(num==0) {
           return false;
       }
       else{
           return ((num & num-1)==0);
       }
    }
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
       int num=sc.nextInt();
       if(checkPoweofTwo(num))
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
    }
}
