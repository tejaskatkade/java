package queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        
        CustomQueue queue = new CustomQueue();

        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(2);
        queue.insert(5);
        queue.insert(10);
        queue.insert(1);
        //queue.insert(3);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

        queue.insert(100);
        queue.insert(101);
        queue.insert(110);

        queue.display();
    }
}
