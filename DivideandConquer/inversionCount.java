public class inversionCount {
//    Time Complexity : O(n^2)
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

    public static void main(String[] args) {
        int arr[]={70,50,60,10,20,30,80,15};
            int n = arr.length;

            int count = inversionCount(arr, n);
            System.out.println("The inversion count of a given array using brute force approach is: "+count);

    }
}
