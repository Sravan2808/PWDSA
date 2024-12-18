//Tc:O(logn)
//SC:O(1)
public class decimalToBinary {
    public static void printBinaryRepresentation(int num)
    {
        StringBuilder result= new StringBuilder();
        while(num>0){
            int bit=num & 1;
            result.insert(0,bit);
            num>>=1;
        }
        if(result.length()==0){
            result.append("0");
        }
        System.out.println("Binary Representation of a given number is : "+ result);
    }
    public static void main(String[] args) {
        int num=15;
        printBinaryRepresentation(num);
    }
}
