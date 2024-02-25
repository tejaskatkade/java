package HigherOrderFunction;

public class Client {
    public static void main(String[] args) {
        System.out.println("Higher order function are the functions that have function as parameter and also returns the function. It can done using anonymous class or lambda function");

        Workable workable = ()->{
            System.out.println("working");
        };
        
        Function fun = new Function();
        fun.testingFunction(workable);
    }   
}
