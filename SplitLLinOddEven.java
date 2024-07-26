public class SplitLLinOddEven {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static Node even(Node head){
        Node temp=head;
        Node even=new Node(0);
        Node e=even;
        while(temp != null){
            if(temp.data % 2 == 0){
                e.next=temp;
                e=e.next;
            }
            temp=temp.next;
        }
        e.next=null;
        return even.next;
    }
    public static Node odd(Node head){
        Node temp=head;
        Node odd=new Node(0);
        Node o=odd;
        while(temp != null){
            if(temp.data % 2 != 0){
                o.next=temp;
                o=o.next;
            }
            temp=temp.next;
        }
        o.next=null;
        return odd.next;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(7);
        Node e=new Node(2);
        Node f=new Node(1);
        Node g=new Node(9);
        Node h=new Node(8);
        Node i=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        System.out.println("Original list:");
        display(a);
        

        Node evenList = even(a);
        Node oddList = odd(a);

        System.out.println("Even list:");
        display(evenList);

        System.out.println("Odd list:");
        display(oddList);
   }
}
