package Data_Structure.LinkedList.Linkedlist;

public class Add_first {
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
        
        //step 1: create a new node
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head= newnode;
            tail=newnode;
            return;
        }
        //step 2: link the new node to the head
        newnode.next= head;
        //step 3: make the new node as head
        head=newnode;

    }
    public void addlast(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next= newnode;
        tail=newnode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public void addmiddle(int data, int index){
        if(index==0){
            addfirst(data);
            return;
        }
        Node newnode= new Node(data);
        size++;
        Node temp= head;
        int i=0;
        //step 1: traverse to the index
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        //step 2: link the new node to the next node
        newnode.next= temp.next;
        temp.next=newnode;
    }
    public int deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
        }
        int val=head.data;
        head=head.next;
        return val;

    }
    public int deletelast(){
        if(size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size =0;
            return val;
        }
        Node prev= head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
        public static void main(String[] args) {
            Add_first list = new Add_first();
            list.printlist();
            list.addfirst(1);
            list.printlist();
            list.addfirst(2);
            list.printlist();
            list.addfirst(3);
            list.printlist();
            list.addlast(4);
            list.printlist();
            list.addlast(5);
            list.printlist();
            list.addmiddle(6, 3);
            list.printlist();
            System.out.println("size of the list is: "+ list.size);
            list.deletefirst();
            list.printlist();
            list.deletelast();
            list.printlist();
        }
    }

