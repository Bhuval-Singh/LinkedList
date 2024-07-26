public class NthInOneTraversal {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node nthNode(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast != null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static Node deleteNthFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast == null){
            head= head.next;
            return head;
        }
        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
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
        display(a);
        a=deleteNthFromEnd(a, 6);
        display(a);
        
    }
}
