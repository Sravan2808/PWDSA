//Implementation of the function available in the queue data structure in java

import java.util.*;
public class queueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
//        to insert the data in the queue enqueue
        for(int i=0;i<10;i++){
            queue.add(i);
        }

        System.out.println("Queue looks like : "+queue);

//        to print the top most element in the queue
        System.out.println("The top most element in the queue before deletion is:"+ queue.peek());

//        to remove the element from the queue
        queue.remove();

//        to print the topmost element in the queue
        System.out.println("The top most element in the queue after deletion is:"+queue.peek());

//        the size of the current queue
        System.out.println("The size of the queue is:"+queue.size());
    }
}
