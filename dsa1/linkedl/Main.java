package linkedl;
public class Main {
    public static void main(String[] args){
        LL l = new LL();
        l.addFirst(3); 
        l.addFirst(5); 
        l.addFirst(8); 

        System.out.println("Size : "+l.displaySize());

        l.displayLL();
    }
}

