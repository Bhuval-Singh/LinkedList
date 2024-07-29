public class LinkedListAddFirst {

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node temp=new Node(data);
        if(head == null){
            head = tail= temp;
            return;
        }
        temp.next = head;
        head = temp;
    }
public void addLast(int data){
    Node temp=new Node(data);
    if(head == null){
       addFirst(data);
       return;
    }
    tail.next=temp;
    tail=temp;

}
public void add(int idx,int data){
    if(idx == 0){
        addFirst(data);
        return;
    }
    Node newNode=new Node(data);
    Node temp=head;
    int i=0;
    while(i < idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}

    public void print(Node head){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListAddFirst ll = new LinkedListAddFirst();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(7);
        ll.add(2, 7);
        ll.print(head);
    }
}
