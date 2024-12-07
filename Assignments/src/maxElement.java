//Time complexity:O(n)
//Space Complexity: O(1)
public class maxElement {
    public static void main(String[] args){
        int[] arr={20,45,68,12,10,9,67,87,90,100};
        int max=Integer.MIN_VALUE;

        for(int num:arr){
            max=Math.max(max,num);
        }
        System.out.println("The maximum element in the array is : " + max);
    }
}
