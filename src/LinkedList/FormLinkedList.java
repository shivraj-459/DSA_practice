package LinkedList;

public class FormLinkedList {

    Node head;
    private int size;

    FormLinkedList(){
        this.size=0;
    }

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }


    public void addFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }

        node.next=head;
        head=node;
    }

    public void addLast(int data){

        Node node =new Node(data);

        if(head==null){
            head=node;
            return;
        }

        Node curr=head;
        while(curr.next!=null){

            curr=curr.next;
        }
        curr.next=node;
    }


    public void deleteFirst(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    public void deleteLast(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }

        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;

        while(lastNode.next!=null){

            lastNode=lastNode.next;
            secondLast=secondLast.next;

        }

        secondLast.next=null;
    }

    public int getSize(){

        return this.size;
    }

    public void reverseListIterative(){

        if(head==null || head.next==null){
            return;
        }

        Node prev=head;
        Node curr=head.next;

        while(curr!=null){
            Node future=curr.next;
            curr.next=prev;
            prev=curr;
            curr=future;
        }

        head.next=null;
        head=prev;

    }

    public Node reverseRecursive(Node head){

        if(head==null || head.next==null){

            return head;
        }

        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }

    public void printList(){

        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        Node curr=head;
        while(curr!=null){

            System.out.print(curr.data+" ");
            curr=curr.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        FormLinkedList ll=new FormLinkedList();

         ll.addFirst(2);
         ll.addFirst(3);
         ll.addLast(5);

        ll.head = ll.reverseRecursive(ll.head);
        ll.printList();
         //ll.reverseListIterative();



    }
}
