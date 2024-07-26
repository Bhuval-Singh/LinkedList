public class CreatingLL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    
    public static class linkedList{
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head == null){
                head = tail = temp;
            } else{
                tail.next = temp;
                tail=temp;
            }
        }
        void insertAtBegin(int data){
            Node temp= new Node(data);
            if(head == null){
                head = tail = temp;
            } else{
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int idx,int data){
            Node t=new Node(data);
            Node temp=head;
            if(idx == 0){
                insertAtBegin(data);
                return;
            } else if(idx == size()){
                insertAtEnd(data);
                return;
            } else if(idx < 0 || idx > size()){
                System.out.println("Wrong index!");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        int getAt(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void delete(int idx){
            if(idx == 0){
                head=head.next;
                return;
            }
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        void display(){
            Node temp=head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(23);
        ll.insertAtEnd(22);
        ll.insertAtBegin(50);
        ll.insertAt(0, 45);
        ll.insertAt(6, 35);
        ll.insertAtEnd(2);
        ll.display();
        ll.delete(0);
        System.out.println();
        ll.display();
    }
}
