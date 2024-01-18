import java.util.Scanner;

class Node{

	int data;
	Node next = null;

	Node(int data){
	
		this.data = data;
	}

}
class LinkedLL{

	Node head = null;

	void addNode(int data){
		
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
	void printLL(){
	
		if(head == null){
			return;
		}else{
		
			Node temp = head;
			while(temp != null){
			
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	void reverseLL(){
	
		Node back = null;
		Node current = head;
		Node front = null;

		while(current != null){
		
			front = current.next;
			current.next = back;
			back = current;
			current = front;
		}
		head = back; 

	}
	Node recReverseLL(Node current, Node back, Node front){
	
		if(current == null){
		
			return head = back;
		}else{
		
			front = current.next;
			current.next = back;
			back = current; 
			current = front;
		}
		return recReverseLL(current, back, front);	

	}
}
class Client{

	public static void main(String[] args){
		char ch;
		LinkedLL ll = new LinkedLL();	
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("1. Add Node");
			System.out.println("2. Print LL");
			System.out.println("3. Reverse LL");
			System.out.println("4. Recursive Rev LL");
			
			System.out.println("Enter 1 / 2 / 3 / 4");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1:
					{
						System.out.println("Enter data");
						int data = sc.nextInt();
						ll.addNode(data);
					}
					break;
				case 2:
					ll.printLL();
					break;
				case 3:
					ll.reverseLL();
					break;
				case 4:
					ll.recReverseLL(ll.head,null,null);
					break;
				default:

					System.out.println("Wrong Choice");

			}

			
			System.out.println("Do you want to continue ? (y/n)");
			ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');	

	}
}
