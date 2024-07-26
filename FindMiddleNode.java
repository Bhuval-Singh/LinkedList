// In odd size its return midle element but in even size it return left miidle element!

public class FindMiddleNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node middleNode(Node head){
        Node slow=head,fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        a=middleNode(a);
        display(a);
    }
}
