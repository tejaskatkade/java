// Thread Group

class MyThread extends Thread{

    public MyThread(ThreadGroup tG, String str){
            super(tG,str);
    }

    public void run(){
            System.out.println(getName()+" | "+currentThread());
    }
}
class ThreadGroupDemo{

    public static void main(String[] args){

            ThreadGroup pTG = new ThreadGroup("Tata"); // Creating Thread Group

            // Creating Threads in Thread Group
            MyThread obj1 = new MyThread(pTG,"Titan");
            obj1.start();
            MyThread obj2 = new MyThread(pTG,"Tanishk");
            obj2.start();
            MyThread obj3 = new MyThread(pTG,"StarBucks");
            obj3.start();


    }
}
