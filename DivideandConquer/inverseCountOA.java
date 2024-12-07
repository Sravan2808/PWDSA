import java.util.Arrays;

public class inverseCountOA {
    public static int inversionCount(int[] arr, int n){
        int count = 0;
        // loops - i < j
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                // condition - arr[i] > arr[j]
                if(arr[i] > arr[j]){
                    count = count + 1;
                }
            }
        }
        return count;

    }
//   function to implement the mergeProcedure
    public static int mergeProcedure(int[] arr,int l,int mid,int h){
//        taken the extra space-O(n)
        int swap=0;
        int[] lsubarray= Arrays.copyOfRange(arr,l,mid+1);
        int[] rsubarray=Arrays.copyOfRange(arr,mid+1,h+1);

        int i=0,j=0,k=l;

        while(i<lsubarray.length && j<rsubarray.length){
            if(lsubarray[i]<=rsubarray[j]){
                arr[k++]=lsubarray[i++];
            }
            else{
                arr[k++]=rsubarray[j++];
                //        assignment problem
                swap += (mid+1)-(l+i);

            }
        }
        while(i<lsubarray.length){
            arr[k++]=lsubarray[i++];
        }
        while(j<rsubarray.length){
            arr[k++]=rsubarray[j++];
        }
        return swap;
    }
//    function definition of counting of number of inversion via divide&conquer approach
    public static int  inversionCountOpt(int[] arr,int l ,int h){
        int count=0;
        if(l<h){
            //1.Divide the array into subproblems
            int mid=l+(h-l)/2;
//            2.conquer the subproblems via the concept of recursion
//            left subarray
            count += inversionCountOpt(arr,l,mid);
//            right subarray
            count += inversionCountOpt(arr,mid+1,h);
//            3.combine the result of left and right subarray
//            to get final solution
            count += mergeProcedure(arr,l,mid,h);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={70,50,60,10,20,30,80,15};
        int arr1[]={5,4,3,2,1};
        int n = arr.length;
        int n1=arr1.length;

        int count = inversionCount(arr, n);
        System.out.println("The inversion count of a given array using bruteforce Approach  is: "+count);

        int countOpt = inversionCountOpt(arr1,0,n1-1);
        System.out.println("The inversion count of a given array using Divide & Conquer Approach  is: " +countOpt);

    }

}
