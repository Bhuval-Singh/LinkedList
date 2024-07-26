public class CreatingLinkL2 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class  linkedList2 {
        Node head=null;
        Node tail=null;

        void insertHead(int data){
            Node temp=new Node(data);
            if(head == null){
                head = tail = temp;
            } else{
                temp.next=head;
                head = temp;
            }
        }

        void insertTail(int data){
            Node temp=new Node(data);
            if(head == null){
                insertHead(data);
            } else{
                tail.next=temp;
                tail=temp;
            }
        }

        void insertAt(int idx,int data){
            Node t=new Node(data);
            Node temp=head;
            if(idx < 0 || idx > size()){
                System.out.println("Wrond index!");
                return;
            } else if(idx == 0){
                insertHead(data);
                return;
            } else if(idx == size()){
                insertTail(data);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int size(){
            Node temp = head;
            int count=0;
            while(temp !=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedList2 ll =new linkedList2();
        ll.insertHead(14);
        ll.insertHead(12);
        ll.insertTail(23);
        ll.insertAt(0,5);
        ll.insertAt(4, 45);
        ll.display();
    }
}
