package dsa.pract.linkedlist;

/**
 * @author KMEVADA
 *
 */
public class DoublyCircularLinkedList {
	DLLNode tail;
	
	public void insertFirst(DLLNode node){
		if(tail == null){
			node.setNext(node);
			node.setPrev(node);
			tail = node;
		}
		else{
			DLLNode last = getLast();
			last.setNext(node);
			node.setPrev(last);
			node.setNext(tail);
			tail.setPrev(node);
			tail = node;
		}
	}
	
	public void insertLast(DLLNode node){
		if(tail == null){
			node.setNext(node);
			node.setPrev(node);
			tail = node;
		}
		else{
			DLLNode last = getLast();
			node.setNext(last.getNext());
			node.setPrev(last);
			last.setNext(node);
			tail.setPrev(node);
		}
	}
	
	public void deleteFirst(){
		if(tail == null){
			System.out.println("List is empty");
		}
		else if(tail.getNext() == tail.getPrev()){
			System.out.println("Deleted -> " + tail.getData());
			tail = null;
		}
		else{
			System.out.println("Deleted -> " + tail.getData());
			tail.getPrev().setNext(tail.getNext());
			tail.getNext().setPrev(tail.getPrev());
			tail = tail.getNext();
		}
	}
	
	public void deleteLast(){
		if(tail == null){
			System.out.println("List is empty");
		}
		else if(tail.getNext() == tail.getPrev()){
			System.out.println("Deleted -> " + tail.getData());
			tail = null;
		}
		else{
			System.out.println("Deleted -> " + tail.getPrev().getData());
			tail.setPrev(tail.getPrev().getPrev());
			tail.getPrev().setNext(tail);
		}
	}
	
	public DLLNode getLast(){
		 DLLNode tmp = tail;
		 while(tmp.getNext() != tail){
			 tmp = tmp.getNext();
		 }
		 return tmp;
	}
	
	public void print(){
		if(tail == null){
			return;
		}
		DLLNode tmp = tail;
		while(tmp.getNext() != tail){
			System.out.print(tmp.getData() + ",");
			tmp = tmp.getNext();
		}
		System.out.println(tmp.getData());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DoublyCircularLinkedList ll = new DoublyCircularLinkedList();
		
		ll.insertFirst(new DLLNode(1, null, null));
		ll.insertFirst(new DLLNode(2, null, null));
		ll.insertFirst(new DLLNode(3, null, null));
		ll.insertFirst(new DLLNode(4, null, null));
		ll.print();
		ll.insertLast(new DLLNode(5, null, null));
		ll.insertLast(new DLLNode(6, null, null));
		ll.insertLast(new DLLNode(7, null, null));
		ll.print();
		
		ll.deleteFirst();
		ll.print();
		
		ll.deleteLast();
		ll.deleteLast();
		ll.print();
	}

}
