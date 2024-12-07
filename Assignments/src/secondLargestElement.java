//time complexity : O(n)
//space complexity : O(1)
public class secondLargestElement {
    public static void main(String[] args){
            int[] arr={20,45,68,12,10,9,67,87,90,100};
            //max1=first maximum value
            //max2=second maximum value
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;

            for(int num:arr){
                max1=Math.max(max1,num);
            }
        for (int num:arr) {
            if(num!=max1){
                max2=Math.max(max2,num);
            }
            
        }
        if(max2 == Integer.MIN_VALUE){
            System.out.println("No second largest element in an array");
        }
        else{
            System.out.println("The second largest element in the array is : "  +max2);
        }
            System.out.println("The maximum element in the array is : " + max1);
        }
    }
