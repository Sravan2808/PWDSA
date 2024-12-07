public class insertAtBEginning {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
             data = d;
            next = null;
        }
    }

        public void insertAtEnd(int newData) {
            Node newNode = new Node(newData);
            //LL is empty
            if (head == null) {
                head = new Node(newData);
                return;
            }
//              LL is not empty
            newNode.next = null;
//              tranversing it to the end of the LL
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return;
        }

        //          inserting a new Node At the Beginning
        public void insertAtBegining(int newData) {
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;

        }

        //              Displaying LL
        public void Display() {
            Node current = head;
            while (current != null) {
                System.out.print( + current.data +"-> ");
                current = current.next;
            }
        }

        public static void main(String[] args) {
            insertAtBEginning ll1 = new insertAtBEginning();
            ll1.insertAtEnd(2);
            ll1.insertAtEnd(4);
            ll1.insertAtEnd(6);
            System.out.println("Displaying all elements after that i will display the 10 element");
            ll1.Display();
            System.out.println();
            ll1.insertAtEnd(10);
            ll1.insertAtBegining(1);
            ll1.insertAtBegining(19);
            System.out.println("After the insert at begining");
            ll1.Display();
            System.out.println();


        }
    }
