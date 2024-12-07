public class LinkedList3 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
//    if ll is empty
    public void insertAtEnd(int newData){
        Node newNode=new Node(newData);
//        if LinkedList is empty
        if (head==null){
            head=new Node(newData);
            return;
        }
//        if LinkedList not empty
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    public void Display(){
        Node current=head;
        while (current!=null){
            System.out.print(+current.data + " ");
            current=current.next;
        }
    }
//    implementation of finding out the middle node in a LinkedList
    public void middleNode(){
        Node slowPtr=head;
        Node fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        System.out.println("Middle data of a given LinkedList is "+slowPtr.data+" ");
    }

    public static void main(String[] args) {
        LinkedList3 ll3 = new LinkedList3();
        ll3.insertAtEnd(1);
        ll3.insertAtEnd(2);
        ll3.insertAtEnd(3);
        ll3.insertAtEnd(4);
        //ll3.insertAtEnd(5);
        ll3.Display();
        System.out.println();
        ll3.middleNode();
        System.out.println();

    }
}
