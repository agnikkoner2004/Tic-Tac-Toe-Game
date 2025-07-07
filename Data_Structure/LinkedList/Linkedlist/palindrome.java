package Data_Structure.LinkedList.Linkedlist;

public class  palindrome{
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
    //find the middle of the linked list
    public Node findmiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //To check if the linked list is palindrome
    public boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=findmiddle(head);
        //step 2: reverse the second half of the linked list
        Node curr=mid;
        Node prev=null;
        while(curr!=null){
             Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //step 3: compare the first half and the reversed second half
        Node left=head;
        Node right=prev; // this is the head of the reversed second half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome list = new palindrome();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        System.out.println("Is the linked list a palindrome? " + list.isPalindrome(head));
    }
}

