/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class DoublyLinkedList<E> {
	
	DLLNode<E> head = null;
	DLLNode<E> tail = null;
	int length = 0;
	
	public DoublyLinkedList() {
		/*head = new DLLNode(Integer.MIN_VALUE, null, null);
		tail = new DLLNode(Integer.MIN_VALUE, null, null);
		head.setNext(tail);
		tail.setPrev(head);
		length = 0;*/
	}
	
	public void insertFirst(E e){
		DLLNode<E> node = new DLLNode<E>(e, null, null);
		if(head == null){
			head = tail = node;
			head.setNext(tail);
			tail.setPrev(head);
		}
		else{
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}
		length++;
	}
	
	public void insertLast(E e){
		DLLNode<E> node = new DLLNode<E>(e, null, null);
		if(tail == null){
			head = tail = node;
			head.setNext(tail);
			tail.setPrev(head);
		}
		else{
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
		}
		length++;
	}
	
	public void insertAtPos(E e,int pos){
		if(pos <= 0){
			insertFirst(e);
		}
		else if(pos >= length){
			insertLast(e);
		}
		else{
			DLLNode<E> node = new DLLNode<E>(e, null, null);
			DLLNode<E> next = head;
			int i = 0;
			while(i < pos){
				next = next.getNext();
				i++;
			}
			next.getPrev().setNext(node);
			node.setPrev(next.getPrev());
			node.setNext(next);
			next.setPrev(node);
			length++;
		}
	}
	
	public void deleteFirst(){
		if(head != null){
			System.out.println("Deleted -> " + head.getData());
			if(head.getNext() == null || head == tail){
				head = tail = null;
			}
			else{
				head = head.getNext();
				head.setPrev(null);
			}
			length--;
		}
	}
	
	public void deleteLast(){
		if(tail != null){
			System.out.println("Deleted -> " + tail.getData());
			if(tail.getPrev() == null || head == tail){
				tail = head = null;
			}
			else{
				tail.getPrev().setNext(null);
				tail = tail.getPrev();
			}
			length--;
		}
	}
	
	public void deleteAtPos(int pos){
		if(pos <= 0){
			deleteFirst();
		}
		else if ( pos >= length){
			deleteLast();
		}
		else{
			DLLNode<E> prev = head,next = head;
			int i = 1;
			while( i < pos){
				prev = next;
				next = next.getNext();
				i++;
			}
			System.out.println("Deleted -> " + next.getData());
			prev.setNext(next.getNext());
			next.getNext().setPrev(prev);
			length--;
		}
	}
	
	public void print(){
		if(head == null){
			System.out.println("Empty Linked List");
			return;
		}
		DLLNode<E> temp = head;
		while(temp.getNext() != null){
			System.out.print(temp.getData() + ",");
			temp = temp.getNext();
		}
		System.out.println(temp.getData() + ",");
	}
	
}
