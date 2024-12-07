//TC:O(logn)
//SC:O(1)
public class frequencyTarget {
    public static int getfirstOccur(int arr[],int low,int high,int target){
        int result=-1;
        while(low<=high){
            //To avoid the overflow
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                //we want lower bound of an element,so we need to tranverse towards left side of an array
                high = mid-1;

            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
        public static int getlastOccur ( int[] arr, int low, int high, int target){
            int result = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    result = mid;
                    low = mid + 1;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
            return result;
        }

        public static void main (String[] args){
            int arr[] = {2, 3, 5, 5, 5, 8, 8, 8, 8, 8, 9, 12};
            int target = 8;
            int firstOccur = getfirstOccur(arr, 0, arr.length - 1, target);
            int lastOccur = getlastOccur(arr, 0, arr.length - 1, target);
            if (firstOccur == lastOccur && firstOccur == -1) {
                System.out.println("The target is not available in the array");
            } else {
                int frequency = lastOccur - firstOccur + 1;
                System.out.println("The count of the given target element is : " + frequency);
            }
        }
    }

