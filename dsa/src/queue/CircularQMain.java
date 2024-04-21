package queue;

public class CircularQMain {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();

        circularQueue.insert(3); // 0
        circularQueue.insert(4); // 1
        circularQueue.insert(5); // 2
        circularQueue.insert(6); // 3
        circularQueue.insert(7); // 4
        circularQueue.insert(8); // Full...
        circularQueue.insert(9); // Full...
        
        circularQueue.display();  // 3 -- 4 -- 5 -- 6 -- 7

        circularQueue.insert(11);  // Full...

        circularQueue.remove();  // 3
        circularQueue.remove();  // 4
        circularQueue.remove();  // 5
        circularQueue.remove();  // 6

        circularQueue.display(); // 7

        circularQueue.insert(6);  // 0
        circularQueue.insert(7);  // 1
        circularQueue.insert(8);  // 2 
        circularQueue.insert(9);  // 3

        circularQueue.display();   // 7 -- 6 -- 7 -- 8 -- 9

        circularQueue.remove();  // 7
        circularQueue.remove();  // 6
        circularQueue.remove();  // 7
        circularQueue.remove();  // 8
        circularQueue.remove();  // 9
        circularQueue.remove();  // empty
        circularQueue.remove();  // empty
 
        circularQueue.display(); // empty

        circularQueue.remove();  //empty





    }
}
