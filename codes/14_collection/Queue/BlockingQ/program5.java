// Priority Blocking Queue

import java.util.*;
import java.util.concurrent.*;


class Employee implements Comparable{

	String name;

	Employee(String name){
		this.name = name;
	}
	public int compareTo(Object obj1){
	
		return name.compareTo(((Employee)obj1).name);
	}
	public String toString(){
		return name;
	}
}

class BlockingQueueDemo{

	public static void main(String args[])throws InterruptedException{
	
		PriorityBlockingQueue bque = new PriorityBlockingQueue(5);
		
		bque.offer(new Employee("Ram"));
		bque.offer(new Employee("Shyam"));
		bque.offer(new Employee("Sachin"));
		bque.offer(new Employee("Virat"));
		bque.offer(new Employee("Dhoni"));

		System.out.println(bque); 	
	}
}
