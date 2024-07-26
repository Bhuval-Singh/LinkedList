public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static Node reverse(Node head){
        if(head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
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
        Node a=new Node(6);
        Node b=new Node(6);
        Node c=new Node(56);
        Node d=new Node(34);
        Node e=new Node(23);
        Node f=new Node(4);
        Node g=new Node(5);
        Node h=new Node(7);
        Node i=new Node(98);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        display(a);
        Node r = reverse(a);
        display(r);
    }
}
