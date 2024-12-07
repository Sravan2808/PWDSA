//Time Complexity : O(n)
//Space Complexity : O(1)
public class sumofvenElements {
    public static void main(String[] args){
        int arr[]={3,20,4,6,9};
        int i=0,sum=0;
        int n=arr.length;
        while(i < n){
            sum+=arr[i];
            //make sure that we willl take only even index elements
            i+=2;
        }
        System.out.println("The sum of even index elements is : "+ sum);
    }
}
