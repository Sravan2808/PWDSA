import java.util.*;
public class stackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
//        insert the elements inside the stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(7);
//        display the top element in the stack
        System.out.println("The topmost element in the stack is : "+stack1.peek());

//        Delete the element from the stack
        stack1.pop();
        System.out.println("The topmost element in the stack is : "+ stack1.peek());

//        Search an element in the stack
//         if the element is not avaiiable in the stack then search method returns -1
        System.out.println("Element 1 is present at position: "+stack1.search(1));

//        whether the stack is empty or not
        System.out.println("Is the stack is empty or not : "+stack1.empty());
    }
}
