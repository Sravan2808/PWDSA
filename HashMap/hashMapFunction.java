import java.io.*;
import java.util.*;
public class hashMapFunction {
    public static void main(String[] args) {
        HashMap<Integer,String>map =new HashMap<>();
//        put() function
        map.put(1,"Sravan");
        map.put(2,"Surya");
        map.put(7,"Srinivas");
        map.put(9,"Cheritan");
        System.out.println("Hashmap of an given data is : "+map);

//        get() function
        String result=map.get(9);
        System.out.println("The value of the given key is :"+result);
//        remove() function
        map.remove(1);
        System.out.println("Updated hashmap is :"+map);
//        containKey() function
        System.out.println("Checking whether key is present or not : "+map.containsKey(1));
//        iternating using the for loop
        for(Map.Entry<Integer,String> ele: map.entrySet()){
            System.out.println(ele.getKey()+ " : "+ele.getValue());
        }

    }
}
