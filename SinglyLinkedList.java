import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class SinglyLinkedList {

	static SinglyLinkedListNode head;

	//INSERT Operation
	public void insertAtTheBeginning(int data) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);   // creation of a new node
		

		// Traversing the list
		SinglyLinkedListNode prev = head;
		while(prev.next!=null) {
			System.out.print(prev.data+" , ");
			SinglyLinkedList.SinglyLinkedListNode temp = prev.next;
		}
		System.out.println();
	}


	
	// DELETE operation on a list
	public void deleteTheFirstNode() {
		if(head==null) {
			System.out.println("empty list. nothing to delete");
			return;
		}
		SinglyLinkedListNode temp = head;
		head = head.next;
		temp = null;
		return;
	}

	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n;
		SinglyLinkedList sll = new SinglyLinkedList();
		
		System.out.println("Enter number of nodes:");
		 n=sc.nextInt();
		
		System.out.println("Enter data in nodes:");
		n=sc.nextInt();
		
		insertAtTheBeginning();
		
}

class SinglyLinkedListNode {
	int data;
	SinglyLinkedListNode next;
	SinglyLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
