package linkedlist;

class Node {
    int data;
    Node next;

    
    public Node(){
        this(null);
    }
    public Node(int item){
        this.data = item;
        this.next = null;
    }
    public Node(Node next){
        this.next = next;
    }
}
public class RemoveDuplicate {
    
    Node head = null;

    public void addNode(int item){
        Node newNode = new Node();
        newNode.data  = item;
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removeDuplicates(){
        if(head == null){
            System.out.println("Empty");    
        }else{

            int item = head.data;
            Node temp = head;

            while (temp.next != null) {
                if(temp.next.data == item){
                    temp.next = temp.next.next;
                }else{
                    item = temp.next.data;
                    temp = temp.next;
                }
            }
        }
    }
    public void display(){
        if(head == null){
            System.out.println("Empty List..");
        }else{
            Node temp = head;
            while (temp.next != null) {
                System.out.print(" | "+temp.data);
                temp = temp.next;
            }
            System.out.println("| "+temp.data + "|");
        }
    }
}
