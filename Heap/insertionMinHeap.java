import java.util.ArrayList;
import java.util.List;

public class insertionMinHeap {
    static void swap(List<Integer> heap , int l,int r){
        int temp = heap.get(l);
       heap.set(l,heap.get(r));
       heap.set(r,temp);
    }
    static void push_up_in_minHeap(List<Integer> heap,int i){
//        compare with parent

//        swap
        int parentIdx = (i-1)/2;
        if( i== 0 || heap.get(parentIdx) < heap.get(i)) return;

        swap(heap,i,parentIdx);
        push_up_in_minHeap(heap,parentIdx);


//        until root reached / correct position found
    }
    static void insert_in_MinHeap(List<Integer> heap,int element){
//        last me add
        heap.add(element);

        int index = heap.size()-1;

        push_up_in_minHeap(heap,index);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insert_in_MinHeap(heap,5);
        System.out.println(heap);


    }
}
