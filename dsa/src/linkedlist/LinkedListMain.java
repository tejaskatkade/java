package linkedlist;

public class LinkedListMain {
    
    public static void main(String[] args) {
        
        // Add Recursively
        // ListRec list = new ListRec();
        // list.addNode(10);
        // list.addNode(15);
        // list.addNode(20);
        // list.addNode(30);
        // list.addNode(40);
        // list.display();
        // list.addAtPos(25, 4);
        // list.display();

        //Remove duplicates;
        RemoveDuplicate list = new RemoveDuplicate();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(3);
        list.addNode(3);
        list.addNode(3);
        list.addNode(4);
        list.addNode(4);
        list.addNode(5);

        list.display();

        list.removeDuplicates();

        list.display();
    }
    
}
