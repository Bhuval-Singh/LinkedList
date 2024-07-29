public class AddAtAnyIndex {
    
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;

    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }
        temp.next=newNode.next;
        temp=newNode;
    }
    public static void main(String[] args) {
        
    }
}
