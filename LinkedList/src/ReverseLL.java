public class ReverseLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
             data=d;
            next=null;
        }
    }
    public void insertAtEnd(int newData){
        Node newNode=new Node(newData);
//        if LinkedList is an Empty
        if(head==null){
            head=new Node(newData);
            return;
        }
//        linkedlist not empty
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
//    implementation of reversal of a Linkedlist using an iterative approach
    public void reverseLL(){
        Node curr=head;
        Node prev_Node=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev_Node;
            prev_Node=curr;
            curr=next;
        }
        head=prev_Node;
        return;
    }
//  implementation  of reversal of a linked lidt using a recursive code
    public void reversalRec(Node curr,Node prev){
//        Last node of the linked list
        if(curr.next==null){
            head=curr;
            curr.next=prev;
            return;
        }
        Node next=curr.next;
        curr.next=prev;
//        recursion concept
        reversalRec(next,curr);
    }
    public void Display(){
        Node current= head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        ReverseLL ll3=new ReverseLL();
        ll3.insertAtEnd(1);
        ll3.insertAtEnd(2);
        ll3.insertAtEnd(3);
        ll3.insertAtEnd(4);
        ll3.insertAtEnd(5);
//        ll3.reverseLL();
        ll3.reversalRec(ll3.head,null);
        System.out.println("The reversal of LinkedList elements : ");
        ll3.Display();
        System.out.println();

    }
}
