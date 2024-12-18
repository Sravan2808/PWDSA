import java.util.ArrayList;
import java.util.List;

public class DeletionMinHeap {
    public static void swap(List<Integer> heap ,int left,int right){
        int temp = heap.get(left);
        heap.set(left,heap.get(right));
        heap.set(right,temp);
    }
    private static void deleteFromMinHeap(List<Integer> heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);

        push_down_in_MinHeap(heap,0);
    }

    private static void push_down_in_MinHeap(List<Integer> heap,int index) {
        int n = heap.size()-1;
        if(index == n){
            return;
        }
        int left = (2*index)+1;
        int right = (2*index)+2;
        int smallest = index;
        if(left <=n && heap.get(left) <  heap.get(smallest)){
            smallest = left;
        }
        if(right <= n && heap.get(right) <  heap.get(smallest)){
            smallest = right;
        }
        if(smallest == index){
            return;
        }
        swap(heap,index,smallest);
        push_down_in_MinHeap(heap,smallest);
    }

    public static void main(String[] args) {
        List<Integer>  heap = new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);
        System.out.println(heap);
        deleteFromMinHeap(heap);
        System.out.println(heap);
    }
}
