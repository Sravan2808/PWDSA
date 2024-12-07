public class LinkedList1 {
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
//        Ll is Empty
        if(head==null)
        {
            head=new Node(newData);
            return;
        }
//        Ll is not empty
        newNode.next=null;
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    public void insertAtBegining(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    };

    public void atAnyPosition(Node prev_node,int newData){
        if(prev_node==null){
            System.out.println("The previous node cannot contain the null");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next=prev_node.next;
        prev_node.next=newNode;

    }
    public void Display(){
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data + "->");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList1 linkedList1=new LinkedList1();
        linkedList1.insertAtEnd(2);
        linkedList1.insertAtEnd(4);
        linkedList1.insertAtEnd(8);
        System.out.println("Before insertion of 10,1 and 19");
        linkedList1.Display();
        System.out.println();
        linkedList1.insertAtEnd(10);
        linkedList1.insertAtBegining(1);
        linkedList1.insertAtBegining(19);

        System.out.println("After insertion of 10,1 and 19");
        linkedList1.Display();
        System.out.println();
        linkedList1.atAnyPosition(linkedList1.head.next.next.next, 18);
        linkedList1.Display();
        System.out.println();

    }
}
