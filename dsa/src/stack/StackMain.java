package stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        //CustomStack stack = new CustomStack();
        CustomStack stack = new DynamicStack();

        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(2);
        stack.push(9);
        stack.push(1);
        stack.push(10);
        stack.push(11); //Stack is Full !!!

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());  // Element can not be pop from Empty stack

        
    }
}
