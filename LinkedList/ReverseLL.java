package LinkedList;
public class ReverseLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
        
    }
    public static Node head;
        public static Node tail;
        public static int size;
    public  void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return ;

        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void reversell(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        

    }
    public static void main(String[] args) {
        ReverseLL ll=new ReverseLL();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        
        ll.reversell();

        ll.print();
       

        
    }
}
