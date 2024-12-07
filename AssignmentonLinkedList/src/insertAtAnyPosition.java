public class insertAtAnyPosition {
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
    public void insertAtAnyposition(Node prev_node,  int newData){

        if(prev_node==null){
            System.out.println("The element contain null values");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next=prev_node.next;
        prev_node.next=newNode;
    }
    public void Display(){
        Node current= head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        insertAtAnyPosition ll= new insertAtAnyPosition();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtAnyposition(ll.head.next.next,28 );
        ll.Display();

    }

}
