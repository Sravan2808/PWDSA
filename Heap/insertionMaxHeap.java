import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insertionMaxHeap {

    static void swap(List<Integer> heap ,int l,int r){
        int temp = heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }

    static void  push_up_in_maxHeap(List<Integer> heap,int i){
        int parentIdx = (i-1)/2;
        if(i==0 || heap.get(parentIdx) > heap.get(i)) return;

        swap(heap,parentIdx,i);
        push_up_in_maxHeap(heap,parentIdx);
    }
    static void insert_in_MaxHeap(List<Integer> heap,int element){
        heap.add(element);

        int index = heap.size()-1;

        push_up_in_maxHeap(heap,index);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        System.out.println(heap);
        System.out.print("Insertion the Element : ");
        int element = sc.nextInt();
        insert_in_MaxHeap(heap,element);
        System.out.println(heap);
    }
}
