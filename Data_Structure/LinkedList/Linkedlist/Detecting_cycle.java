package Data_Structure.LinkedList.Linkedlist;

public class Detecting_cycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;    
    public static int size;

    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move slow by 1 step
            fast = fast.next.next; // move fast by 2 steps
            
            if (slow == fast) { // if they meet, there is a cycle
                return true;
            }
        }
        return false; // if we reach here, no cycle exists
        public static void deleteCycle(){
            Node slow=head;
            Node fast=head;
            boolean cycle= false;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    cycle=true;
                    break;
                }
            }
            if(cycle=false){
                return;
            }
            //find meeting point
            slow=head;
            Node prev=null;
            while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            //remove cycle
            prev.next=null;
        
    }
    public static void main(String[] args) {
        // Example usage
        head = new Node(1);
        Node temp= new Node(2);
        head.next = temp;
       // head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = temp;
        head.next.next.next.next = head.next; // creating a cycle for testing

        boolean result = hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result);
        deleteCycle();
        System.out.println(result);
    }

}
