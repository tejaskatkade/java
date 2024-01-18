//package abstractClass;

abstract class Parent {
    void career(){
        System.out.println("Doctor");
    }
    abstract void marry();
}
class Child extends Parent{
    void marry(){
        System.out.println("Katrina Kaif");
    }
}

class Client{
    public static void main(String[] args){
        Child obj = new Child();
        obj.career();
        obj.marry();
    }
}
