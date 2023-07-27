package PracticeQuestionsJava.Linkedlist;
class AddInlinkedlist {
     Node head;
    class Node{
        int data;
        Node next;

        Node(int data){//constructor
            this.data=data;
            this.next=null;
        }
    }
    //add- first,last
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode =currNode.next;
        }
        currNode.next=newNode;
    }
    //prrint
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
         Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data + "--> ");
            currNode =currNode.next;
        }
        System.out.println("NULL");
    }
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        // Node nextNode;
        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=prevNode;
    }
    public Node reverseRecursive(Node head){
        if(head ==null || head.next==null){
            return head;   
    }
    Node newHead=reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;
    }
    public static void main (String args[]){
        AddInlinkedlist list=new AddInlinkedlist();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.addFirst(6);
        list.addFirst(7);
        list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}
 