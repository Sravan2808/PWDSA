//Tc:O(logn)
//Sc:O(1)
public class perfectSquareno {
    public static boolean isPerfect(int num) {
        int low = 0;
        int high = num;
        if (num == 1) {
            return true;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long value = mid * mid;
            if (value == num) {
                return true;
            } else if (value < num) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
            return false;
        }
    public static void main(String[] args) {
        int num=144;
        if(isPerfect(num))
        {
            System.out.println("Number is an perfect is a perfect a sqrt number");
        }
        else
            System.out.println("Number is a non_perfect sqrt number");
    }
}
