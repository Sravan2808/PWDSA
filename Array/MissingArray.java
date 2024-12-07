package Array;
//Time Complexity:O(n)
//Space Complexity:O(1)
public class MissingArray {
    public static void main(String args[])
    {
        int arr[]={1,2,4,5,6,7,8};
        int n=arr.length;
        int sum=0;
        //time Complexity of sum of natural number is O(1)
        int sum_natural_num = ((n+1)*(n+2)/2);
//        Time complexity to get sum of current array element : O(n)
        for(int i=0;i<n;i++)
        {
           sum += arr[i];
        }
        int missing_num=(sum_natural_num - sum);
        System.out.println("Missing number in array : " + missing_num);
    }
}
