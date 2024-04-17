package stack;

public class CustomStack {

    private static int size = 7;
    protected int[] data;
    private int ptr = -1;
    public CustomStack(){
        this(size);
    }
    public CustomStack(int size){
        this.data = new int[size];
    } 

    public boolean isFull(){
        return ptr == data.length - 1; // if pointer is at last index of an array
    }

    public boolean isEmpty(){
        return ptr == -1; 
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full !!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Element can not be pop from Empty stack");
        }
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Element can not be peek from Empty stack");
        }
        return data[ptr];
    }

}
