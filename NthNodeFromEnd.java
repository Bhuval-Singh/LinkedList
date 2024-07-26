// Find the nth node from last of list.
public class NthNodeFromEnd {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static Node deleteNode(Node head,int n){
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp=temp.next;
        }
        int m= size - n +1;
        Node t=head;
        for(int i=1;i<=m-1;i++){
            t=t.next;
        }
        return t;
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(23);
        Node c = new Node(34);
        Node d = new Node(23);
        Node e = new Node(56);
        Node f = new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node q=deleteNode(a,1);
        System.out.println(q.data);

    }
}
