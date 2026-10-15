package LinkedList;

public class addLL {
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
    
    public static void main(String[] args) {
        addLL ll=new addLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(0);
        ll.print();
        
    }
}