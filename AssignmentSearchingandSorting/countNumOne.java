//Tc:O(logn)
//Sc:O(1)
public class countNumOne {
    public static int getcountOne(int[] arr,int low,int high)
    {
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==0)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return arr.length-low;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,1,1,1};
        int countOne = getcountOne(arr,0,arr.length-1);
        System.out.println("Count of number 1's in the given array is :"+countOne);
    }
}
