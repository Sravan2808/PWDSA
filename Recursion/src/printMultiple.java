import java.util.*;
public class printMultiple {
    public static void printMult(int n,int k){
        //1.BaseCase condition
        if(k==1){
            System.out.println(n);
            return;
        }
        //Recursive Function call
        printMult(n,k-1);
        System.out.println(n*k);
    }
    //Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number : ");
        int n=sc.nextInt();
        System.out.println("Enter the k number : ");
        int k = sc.nextInt();
        //function call
        printMult(n,k);
        System.out.println();

    }
}
