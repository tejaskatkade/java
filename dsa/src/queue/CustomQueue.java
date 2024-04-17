package queue;

public class CustomQueue {
    protected int[] data;
    private static int size = 7;
    //private int start = -1;
    private int end = -1;


    public CustomQueue(){
        this(size);
    }
    
    public CustomQueue(int size){
        this.data = new int[size];
    }


    public boolean isFull(){
        return end == data.length -1;
    }

    public boolean isEmpty(){
        return end == -1;
    }

    public boolean insert(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[++end] = element;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            //System.out.println("Queue is Empty");
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        for (int i = 0; i < end; i++) {
            data[i] = data[i+1];
        }
        end--;
        return removed;
    }

    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("End");
    }
}
