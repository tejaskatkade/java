package queue;

public class CircularQueue {
    int[] data;
    static int size = 5;
    int start = -1;
    int end = -1;

    public CircularQueue(){
        this(size);
    }
    
    public CircularQueue(int size){
        this.data = new int[size];
    }
    
    boolean isFull(){
        return ((start == 0 && end == size -1) || (start - end == 1) );
    }

    boolean isEmpty(){
        return start == -1;
    }
    
    public boolean insert(int item){
        if (isFull()) {
            System.out.println("Full...");
            return false;
        } else {

            if(start == -1){
                start++;
                end++;

                data[end] = item;
            }else{
                if(end == size -1){
                    end = -1;
                }
                end++;
                data[end] = item;

            }
            return true;
        }

    }

    public boolean remove(){
        if (isEmpty()) {
            System.out.println("Empty//");
            return false;
        } else {
            int item = data[start];

            if(start == end){
                start = -1;
                end = -1;
            }else{
                if(start == size -1){
                    start = -1;
                }
                start++;
            }
            System.out.println(item);
            return true;
        }
    }

    public void display(){
        
        if (isEmpty()) {
            System.out.println("Empty ...");
        }else{
            int i = start;
            while (i != end) {
                System.out.print(data[i] + " -- ");
                if(i == size-1){
                    i = -1;
                }
                i++;
            }
            System.out.println(data[i]);
        }
    }


}
