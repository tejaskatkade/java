package linkedlist;

import java.util.Scanner;

public class LL1 {

    // Node
    private class Node{
        int data;
        Node next;
    
        // public Node(){
        // }
        // public Node(int data){
        //     this.data = data;
        // }
        // public Node(int data, Node next){
        //     this.data = data;
        //     this.next = next;
        // }
        public Node(Node next){
            this.next = next;
        }
    }

    // Head Pointer pointing to the first node
    Node head = null;

    // creating node with next = null
    public Node createNode(){
        Node newNode = new Node(null);
        return newNode;
    }

    // adding node to the start of linked list 
    public void addFirst(int data){
        Node newNode = createNode();
        newNode.data = data;

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    // adding node to the end of linked list 
    public void addLast(int data){
        Node newNode = createNode();
        newNode.data = data;

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

    public void deleteFirst(){
        if(head == null){
            System.out.println("Linked List is Empty..!");
        }else if(head.next == null){
            head = null;
        }else{
            head = head.next;
        }
    }

    // Delete last node
    public void deleteLast(){
        if(head == null){
            System.out.println("Linked List is Empty..!");
        }else if(head.next == null){
            head=null;
        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;

        }
    }

    // printing complete linked list
    public void printNode(){
        if(head == null){
            System.out.println("LinkedList is empty ..!");
        }else if(head.next == null){
            System.out.println("|"+head.data+"|");
        }else{
            Node temp = head;

            while(temp.next != null){
                System.out.print("|"+temp.data+"| => ");
                temp = temp.next;
            }
            System.out.println("|"+temp.data+"|");
        }
    }
    public static void main(String[] args) {
        LL1 list = new LL1();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter choice");
            System.out.println("1. Add at first");
            System.out.println("2. Add at last");
            System.out.println("3. Delete first");
            System.out.println("4. Delete last");
            System.out.println("5. Print Node");
            System.out.println("6. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    {
                        System.out.println("Enter data");
                        int data = sc.nextInt();
                        list.addFirst(data);
                    }
                    break;
                case 2:
                {
                    System.out.println("Enter data");
                    int data = sc.nextInt();
                    list.addLast(data);
                }
                    break;
                case 3:
                    list.deleteFirst();
                    break;
                case 4:
                    list.deleteLast();
                    break;
                case 5:
                    list.printNode();
                    break;
                case 6:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
    
}
