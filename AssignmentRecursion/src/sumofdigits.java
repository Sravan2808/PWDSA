public class sumofdigits {
    public static int SOD(int n){
        int result=0;
//        1.Base Case Condition
        if(n==1)
            return n;
//        2.Recursive call
        else{
            result=n%10+SOD(n/10);
        }
        return result;

    }
    public static void main(String[] args) {
        int n=1234;
        int result=SOD(n);
        System.out.println("The sum of the digits of the element is:" +result);
    }
}