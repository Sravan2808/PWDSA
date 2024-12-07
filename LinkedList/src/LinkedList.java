import java.util.List;

public class LinkedList {
//    create a node
    Node head;



    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
//    insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
//        intialize the newNode with the newData entered by the user
        Node newNode=new Node(newData);
//        LinkedList is empty
        if(head==null){
            head=new Node(newData);
            return;
        }
//        linkedList is not empty
        newNode.next=null;
//        traversing the linked list at the end of the node
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
//    Display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+"-> ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        System.out.println("Linkedlist after successful insertion of all the nodes:");
        ll.printNodes();
        System.out.println();

    }
}
