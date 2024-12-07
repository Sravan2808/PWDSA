//time complexity:O(n)
//sp.com:O(1)
public class peakElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,6,5};
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            //left side check and right side check
            if(arr[i-1]<arr[i] &&  arr[i]>arr[i+1]){
                System.out.println("The peak element in an array is : "+arr[i]);
                break;
            }
        }
    }
}
