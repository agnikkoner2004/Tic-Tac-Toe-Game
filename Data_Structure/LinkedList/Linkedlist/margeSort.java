package Data_Structure.LinkedList.Linkedlist;
public class margeSort {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class MyLinkedList {
        Node head;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printList() {
            Node temp = head;
            System.out.print("[");
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.next;
                if (temp != null) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.printList();
        ll.head = new margeSort().mergeSort(ll.head);
        ll.printList();
    }
    //getMid function
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node marge(Node head1 , Node head2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public Node mergeSort(Node head){
        //base case
        if(head==null|| head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left and right ms
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //marge
        return marge(newLeft, newRight);

    }
}
