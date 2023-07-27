package PracticeQuestionsJava.Linkedlist;

class DeleteInLinkedList {
    Node head;
    private int size;
    DeleteInLinkedList(){
        this.size=0;
    }
        class Node{
            String data;
            Node next;
            
        Node(String data){//constructor
            this.data=data;
            this.next=null;
            size++;
        }
    }
      //add- first,last
      public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //last
    public void addLast(String data){
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
    //Delete first
    public void deleteFirst(){
        if(head==null){
         System.out.println("This list is empty");
         return;   
        }
        size--;
        head=head.next;
    }
    //Delete last 
    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head =null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    //print
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
    public int getSize(){
        return size;
    }
    
    public static void main(String args[]){
        DeleteInLinkedList list=new DeleteInLinkedList();        
        list.addFirst("is an vowel");
        list.addFirst("a");
        list.printList();
        list.addLast("Right ?");
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());

    }
}
