import java.util.Scanner;
class Node{

	int data;
	Node next = null;
	Node(int data){
	
		this.data = data;
	}
}

class LinkedList{

	Node head = null;
	Scanner sc = new Scanner(System.in);
	
	void addNode(){
	
		System.out.println("Enter data: ");
		int data = sc.nextInt();

		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			Node temp = head;
			while(temp.next != null){
			
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	Node nReverse(Node temp , int val){		
		
		int n = val;
		Node back =  null;
		Node current = temp;
		Node temp2 = temp;
		Node front = null;
		
		while(n > 0 && current != null){
		
			front = current.next;
			current.next = back;	
			back = current;
			current = front;
			n--;
		}
		if(current == null){
			return back;
		}
		temp2.next = nReverse(current,val);
		return back;

	}
	
	void printLinkedList(){
		
		if(head == null){
		
			System.out.println("Empty...!");
		}else{
		
			Node temp = head;
			while(temp.next != null){
			
				System.out.print("|" + temp.data + "|->");
				temp = temp.next;
			}
			System.out.print("|" + temp.data + "|\n");
				

		}
	}
}
class Client{

	public static void main(String[] args){
	
		LinkedList ll = new LinkedList();
		while(true){
		
			System.out.println("Linked List");
			System.out.println("1. Add Node");
			System.out.println("2. N Reverse ");
			System.out.println("3. Print LinkedList");
			System.out.println("4. Exit Node");
			System.out.println("Enter choice");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice){
			
				case 1:
					ll.addNode();
					break;
				case 2:
					{
						System.out.println("Enter Value of N");
						int n = sc.nextInt();
						ll.head = ll.nReverse(ll.head,n);
					}
					break;
				case 3:
					ll.printLinkedList();
					break;
				case 4:
					return;
					
				default:
					System.out.println("Enter valid choice");

			}

		}	
	}
}
