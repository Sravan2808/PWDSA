public class maxInArray {
    public static int printMax(int arr[],int n,int idx)
    {
//        1.Base case Condition
        if(idx==n)
            return arr[idx];
//        2.Recursive call
        int sme=printMax(arr,n,idx+1);

        int result=Math.max(arr[idx],sme);
        return result;

    }
    public static void main(String[] args) {
        int arr[]={13, 1, -3, 22, 5};
        int n=arr.length-1;
        int result=printMax(arr,n,0);
        System.out.println("The maximum of the array element " + result);
    }
}
