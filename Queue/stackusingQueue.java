//implementation of stack data Structure using Queue
//Time complexity add:O(n)
//Time complexity pop:O(1)
//Space Complexity:O(n)
import java.util.*;
public class stackusingQueue {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();

//    add an element in the stack
//    Time Complexity:O(n)
    static void add(int data){
//        1.Move all the data element from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }
//        2.Insert the new data in q1
        q1.add(data);
//        3.Move back all the data element from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();

        }
    }
//    to remove the element from the stack
//    time Complexity:O(1)
    static int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack underflow");
            System.exit(0);
        }
        int ele=q1.peek();
        q1.poll();
        return ele;
    }
    public static void main(String[] args) {
        stackusingQueue s= new stackusingQueue();
//        push operation in the stack
        s.add(2);
        s.add(5);
        s.add(7);
        s.add(10);

//        pop the element from the stack
        System.out.println("Deleted element is : "+s.pop());
        System.out.println("Deleted element is : "+s.pop());


    }
}
