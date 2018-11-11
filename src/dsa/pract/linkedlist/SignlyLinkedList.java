package dsa.pract.linkedlist;
/**
 * @author KMEVADA
 *
 */
public class SignlyLinkedList {
	
	Node head = null;
	int length = 0;
	
	//insertion operations
	public void insertAtFirst(Node newNode){
		newNode.setNext(head);
		head = newNode;
		length++;
	}
	
	public void insertAtEnd(Node newNode){
		if(head == null){
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		length++;
	}
	
	public void insertAtPosition(Node node,int pos){
		if(pos <= 0 || head == null){
			node.setNext(head);
			head = node;
		}
		else if(pos > length){
			Node temp = head;
			while(temp.getNext()!= null){
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		else{
			Node  next = head;
			int i = 0;
			while(i < (pos-1)){
				next = next.getNext();
				i++;
			}
			node.setNext(next.getNext());
			next.setNext(node);
		}
		length++;
	}
	
	
	//deletion operations
	public void deleteAtFirst(){
		if(head != null){
			System.out.println("Deleted -> " + head.getData());
			head = head.getNext();
			length--;
		}
	}
	
	public void deleteAtEnd(){
		if(head != null){
			Node next = head.getNext(),prev = head;
			while(next.getNext() != null){
				prev = next;
				next = next.getNext();
			}
			prev.setNext(null);
			System.out.println("Deleted -> " + next.getData());
			length--;
		}
	}
	
	public void deleteAtPos(int pos){
		if(head == null){
			return;
		}
		if(pos < 0){
			pos = 0;
		}
		else if(pos >= length){
			pos = length - 1;
		}
		if(pos == 0){
			System.out.println("Deleted -> " + head.getData());
			head = head.getNext();
		}
		else{
			Node next = head,prev = head;
			int i = 0;
			while(i < pos){
				prev = next;
				next = next.getNext();
				i++;
			}
			System.out.println("Deleted -> " + prev.getNext().getData());
			prev.setNext(next.getNext());
		}
		length--;
	}

	public void print(){
		Node tmp = head;
		while(tmp.getNext() != null){
			System.out.print(tmp.getData() + ",");
			tmp = tmp.getNext();
		}
		System.out.print(tmp.getData() + "\n");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignlyLinkedList ll = new SignlyLinkedList();
		
		ll.insertAtFirst(new Node(10, null));
		ll.insertAtEnd(new Node(20, null));
		ll.insertAtPosition(new Node(15, null), 1);
		ll.insertAtPosition(new Node(5, null), 0);
		
		ll.print();
		
		ll.deleteAtPos(4);
		
		ll.print();
		
	}

}
