public class alternateSum {
    public static int AS(int n) {
        int res=0;
//    1.Base case condition
        if(n==0)
            return 0;
        if(n%2==0)
            return AS(n-1)-n;
        else
            return AS(n-1)+n;
    }
    public static void main(String[] args)
    {
        int n=10;
        int res=AS(n);
        System.out.println("The Alternate Sum is : " +res);
    }
}