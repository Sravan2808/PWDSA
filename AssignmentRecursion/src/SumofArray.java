public class SumofArray {
    public static int sumArray(int arr[],int idx){
//        1.Base Case Condition
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
//        2.Recursive call
        int result=arr[idx]+sumArray(arr,idx+1);
        return result;

    }
    public static void main(String[] args) {
        int arr[]={92, 23, 15, -20, 10};
        int result=sumArray(arr,0);
        System.out.println("The sum of the array:" +result);
    }
}
