public class searchLL {
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
//        if LL is not empty
        newNode.next=null;
        Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
                return;
    }
    public void searchLinkedList(int value){
        Node temp=head;
        int flag=0;
        while (temp.next!=null){
            if(temp.data==value){
                flag=1;
                System.out.println(temp.data + " : true");
            }
            temp=temp.next;
        }
        if(flag==0){
            System.out.println("false");
        }


    }
    public static void main(String[] args) {
        searchLL ll= new searchLL();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        System.out.println("The element to be searched");
        ll.searchLinkedList(4);



    }
}
