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
public class ListRec {
    
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
    public Node addRec(int pos, Node temp, int count){
        if(pos-1 ==  count){
            return temp;
        }
        return addRec(pos, temp.next, count+1);
    }

    public void addAtPos(int item ,int pos){
        Node newNode = new Node(item);
        Node temp = addRec(pos,head,1);
        newNode.next = temp.next;
        temp.next = newNode;
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
