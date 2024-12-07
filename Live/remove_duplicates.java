import java.util.*;
public class remove_duplicates {
    public static void remove_duplicates(int[] arr,int size){
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<size;i++){
            if(map.get(arr[i])==null){
                System.out.println(arr[i]+"");
            }
            map.put(arr[i],true);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,5,3,2,5,5,5,1,1,7,9};
        int size= arr.length;
        remove_duplicates(arr,size);
   
    }
}
