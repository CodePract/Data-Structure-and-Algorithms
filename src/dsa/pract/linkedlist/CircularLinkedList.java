package dsa.pract.linkedlist;

public class CircularLinkedList {

	Node tail = null;
	
	public void insertFirst(Node node){
		if(tail == null){
			node.setNext(node);
		}
		else{
			Node last = getLastNode();
			node.setNext(last.getNext());
			last.setNext(node);
		}
		tail = node;
	}
	
	public void insertLast(Node node){
		if(tail == null){
			node.setNext(node);
			tail = node;
		}
		else{
			Node last = getLastNode();
			node.setNext(last.getNext());
			last.setNext(node);
		}
	}
	
	public void deleteFirst(){
		if(tail == null){
			System.out.println("List is empty");
			return;
		}
		System.out.println("Deleted -> " + tail.getData());
		if(tail == tail.getNext()){
			tail = null;
			return;
		}
		Node last = getLastNode();
		last.setNext(tail.getNext());
		tail = tail.getNext();
	}
	
	public void deleteLast(){
		if(tail == null){
			System.out.println("List is empty");
			return;
		}
		if(tail == tail.getNext()){
			System.out.println("Deleted -> " + tail.getData());
			tail = null;
			return;
		}
		Node tmp = tail;
		while(tmp.getNext().getNext() != tail){
			tmp = tmp.getNext();
		}
		System.out.println("Deleted -> " + tmp.getNext().getData());
		tmp.setNext(tail);
	}
	
	public void print(){
		if(tail == null){
			return;
		}
		Node tmp = tail;
		while(tmp.getNext() != tail){
			System.out.print(tmp.getData() + ",");
			tmp = tmp.getNext();
		}
		System.out.println(tmp.getData() + ",");
	}
	
	public Node getLastNode(){
		Node tmp = tail;
		while(tmp.getNext() != tail){
			tmp = tmp.getNext();
		}
		return tmp;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CircularLinkedList cl = new CircularLinkedList();
		
		cl.insertFirst(new Node(1, null));
		cl.insertFirst(new Node(2, null));
		cl.insertFirst(new Node(3, null));
		cl.insertFirst(new Node(4, null));
		cl.insertLast(new Node(5, null));
		cl.insertLast(new Node(6, null));
		
		cl.print();
		
		cl.deleteFirst();
		cl.print();
		cl.deleteFirst();
		cl.print();
		
		cl.deleteLast();
		cl.deleteLast();
		cl.deleteLast();
		cl.deleteLast();
		cl.deleteLast();
		cl.deleteFirst();
		cl.deleteFirst();
		cl.insertLast(new Node(5, null));
		cl.print();
	}

}
