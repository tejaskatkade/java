package abstractClass;

abstract class Parent {
    void career(){
        System.out.println("Doctor");
    }
    abstract void marry();
}

// class Child extends Parent{ // error
// }
abstract class Child extends Parent{ 

}
