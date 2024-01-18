// Abstract class 
// class can contains 0% to 100% abstract methods.

// If method have no body then it is abstract method.
// If any method is abstract then class should be abstract.
// If class is abstract then object can not be created.
//But there is constructor ..for constructor chaining.
// class Parent{      // error
package abstractClass;
abstract class Parent{
    void career(){
        System.out.println("Doctor");
    }
    //void marry();    // error
    abstract void marry();
}
class Client{
    public static void main(String[] args){
       // Parent obj = new Parent();  // error : abstract class's object cannot be created.

    }
}