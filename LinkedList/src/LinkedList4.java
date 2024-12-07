public class LinkedList4 {
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
//        if LinkedList is not Empty
        if(head==null){
            head=new Node(newData);
            return;
        }
//        if LinkedList is not empty
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
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
//    implementation of finding out the cycle in LinkedList
//    floyd's cycle detection algorithm-interview based question
    public void detectLoop(){
        Node slowPtr=head;
        Node fastPtr=head;
        int flag=0;
        while(slowPtr.next!=null && fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("No Loop Detected");
        }
        else{
            System.out.println("Loop Detected");
        }
    }

    public static void main(String[] args) {
        LinkedList4 ll4 = new LinkedList4();
        ll4.insertAtEnd(1);
        ll4.insertAtEnd(2);
        ll4.insertAtEnd(3);
        ll4.insertAtEnd(4);
        ll4.insertAtEnd(5);
        ll4.Display();
        System.out.println();
//        circular LinkedList
        Node temp=ll4.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= ll4.head;

        ll4.detectLoop();
        System.out.println();
    }
}
