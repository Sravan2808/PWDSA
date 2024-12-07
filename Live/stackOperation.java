import java.util.*;
public class stackOperation {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(5);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack " + s.size());

    }
}
       class Stack{
        int size=1000;
       int arr[]=new int[size];
       int top=-1;
       void push(int x){
           top++;
           arr[top]=x;
        }
        int pop(){
           int x=arr[top];
           top--;
           return x;
        }
        int top(){
           return arr[top];
        }
        int size(){
           return top+1;
        }
}
