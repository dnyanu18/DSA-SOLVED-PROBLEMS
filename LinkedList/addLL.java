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



// public class CheckPalindromeLL {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     //add First
//     public void addFirst(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head ==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }

//     //addLast

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     //print ll
//     public void print(){
//         if(head==null){
//             System.out.println("ll is empty");
//             return;

//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+ "->");
//             temp=temp.next;
//         }
//         System.out.print("null");
//         System.out.println();
//     }
// //for find mid 
//     public Node findMid(Node head){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next !=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }

//     // revese 2nd half
//     public boolean checkPalindrome(){
//         if(head ==null || head.next==null){
//             return true;
//         }

//         Node midNode=findMid(head);
//         Node prev=null;
//         Node curr = midNode;
//         Node next;
//         while(curr!= null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         Node right=prev;
//         Node left=head;

//         while(right != null){
//             if(left.data != right.data){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;

//         }
//         return true;
//     }

//     //detecting cycle

//     public static boolean isCycle(){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;

//     }

//     //remove cycle
//     public static void removeCycle(){
//         //detect cycle
//         Node slow=head;
//         Node fast=head;
//         boolean cycle=false;

//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 cycle=true;
//                 break;

//             }
//         }
//         if(cycle==false){
//             return ;
//         }
        


//         //find meeting point 
//         slow =head;
//         Node prev=null;
//         while(slow!=fast){
//             prev=fast;
//             slow=slow.next;
//             fast=fast.next;
//         }
//        //remove cycle ->(lastNode) prev.next=null;

//        prev.next=null;
//     }



//     public static void main(String[] args) {
//         // CheckPalindromeLL ll=new CheckPalindromeLL();
//         // ll.addFirst(2);
//         // ll.addFirst(1);
//         // ll.addLast(2);
//         // ll.addLast(1);
//         // ll.print();
//         // System.out.println(ll.checkPalindrome());

//         head= new Node(1);
//         Node temp=new Node(2);
//         head.next=temp;
//         head.next.next=new Node(3);
//         head.next.next.next=temp;

//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());
//     }
// }

