package linkedlist;

public class LL {
    private static class Node{
        private int data;
        private Node next;

        public Node(){
        }
        
        public Node(int data){
            this.data = data;
        }
        
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    
    public static void main(String[] args) {
        Node n1 = new Node();
        
        n1.data = 5;
        System.out.println(n1.data);
    }

}
