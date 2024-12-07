public class printEvenElements {
    public static void main(String[] args){
        int arr[]={34,21,54,65,43};
        for (int num:arr) {
            //check for the number to be even
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
