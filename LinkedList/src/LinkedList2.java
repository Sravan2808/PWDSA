public class LinkedList2 {
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
//        if LinkedList is Empty
        if(head==null){
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
    public void insertAtBegining(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtAnyPosition(Node prev_data,int newData){
        if(prev_data==null)
        {
            System.out.println("The previous data contain null");
            return;
        }
        Node newNode= new Node(newData);
        newNode.next=prev_data.next;
        prev_data.next=newNode;
    }
    public void deleteNode(int position){
//        linkedList is empty
        if(head==null)
        {
            return;
        }
        Node temp=head;
//        deletion from the beginning
        if(position==0){
            head=temp.next;
            return;
        }
//        deletion is from other position apart from the beginning
        for(int i=0;temp.next!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null && temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }
    public void Display(){
        Node current= head;
        while(current!=null){
            System.out.print(current.data + "-> ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList2 ll2 = new LinkedList2();
        ll2.insertAtEnd(1);
        ll2.insertAtEnd(2);
        ll2.insertAtEnd(3);
        ll2.Display();
        System.out.println();
        ll2.insertAtBegining(7);
        ll2.insertAtBegining(18);
        ll2.insertAtAnyPosition(ll2.head.next, 28);
        ll2.Display();
        System.out.println();
        System.out.println("Delete at any position");
        ll2.deleteNode(3);
        ll2.Display();

    }
}
