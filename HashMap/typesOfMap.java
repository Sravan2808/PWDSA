import java.util.*;
public class typesOfMap {
    public static void main(String[] args) {
//      Unordered
      HashMap<Integer,String> map=new HashMap<>();
      map.put(4,"Bunty");
      map.put(2,"Cheritan");
      map.put(9,"Priya");
      map.put(1,"Srinivas");

        System.out.println("HashMap class map output is :"+map);

//Order of insertion is preserved
        LinkedHashMap<Integer,String> map1=new LinkedHashMap<>();
        map1.put(4,"Bunty");
        map1.put(2,"Cheritan");
        map1.put(9,"Priya");
        map1.put(1,"Srinivas");
      System.out.println("LinkedHashMap class map output is :"+map1);

//      Sorted order on the basis of the key
      TreeMap<Integer,String> map2=new TreeMap<>();
      map2.put(4,"Bunty");
      map2.put(2,"Cheritan");
      map2.put(9,"Priya");
      map2.put(1,"Srinivas");
      map2.put(10,"Sita");
      map2.put(5,"Sravan");
      System.out.println("TreeMap class map output is : "+map2);
    }
}
