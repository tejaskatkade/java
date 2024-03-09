package linkedl;

public class LL{
    private Node head;
    //private Node tail;
    private int size;

    public LL(){
//	this.head = null;
        this.size = 0;
    }
    

    private class Node{
        private int value;
        private Node next;

        // public Node(int value, Node next){
        //     this.value = value;
        //     this.next = next;
        // }
        public Node(int value){
            this.value = value;
            //this.next = next;
        }
    }

    
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int displaySize(){
        return size;
    }

    public void displayLL(){
        if(head == null){
            System.out.println("Linked List is empty ...");
        }else if(head.next == null){
            System.out.println("|"+head.value+"|");
        }else{
            Node temp = head; 
            while (temp.next != null){
                System.out.println("|"+temp.value+"|->");
                temp = temp.next;
            }
             System.out.println("|"+temp.value+"|");
        }

    }
}
