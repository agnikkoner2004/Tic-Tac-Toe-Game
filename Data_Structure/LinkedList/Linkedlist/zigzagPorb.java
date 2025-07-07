package Data_Structure.LinkedList.Linkedlist;

public class zigzagPorb {
     public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addfirst(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head= newnode;
            tail=newnode;
            return;
        }
        newnode.next= head;
        head=newnode;

    }
    //find middle 
    public void zigzag() {
        // Find middle
        Node slow = head;
        Node fast = head != null ? head.next : null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse the second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Zigzag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    
         public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
         }
    
         public static void main(String[] args) {
            zigzagPorb list = new zigzagPorb();
            list.addfirst(1);
            list.addfirst(2);
            list.addfirst(3);
            list.addfirst(4);
            list.addfirst(5);
            list.print();
            list.zigzag();
            list.print();
         }
    }
