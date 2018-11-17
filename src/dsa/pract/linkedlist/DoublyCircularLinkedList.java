/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class DoublyCircularLinkedList<E> {
	DLLNode<E> tail;
	
	public void insertFirst(E e){
		DLLNode<E> node = new DLLNode<E>(e, null, null);
		if(tail == null){
			node.setNext(node);
			node.setPrev(node);
			tail = node;
		}
		else{
			DLLNode<E> last = getLast();
			last.setNext(node);
			node.setPrev(last);
			node.setNext(tail);
			tail.setPrev(node);
			tail = node;
		}
	}
	
	public void insertLast(E e){
		DLLNode<E> node = new DLLNode<E>(e, null, null);
		if(tail == null){
			node.setNext(node);
			node.setPrev(node);
			tail = node;
		}
		else{
			DLLNode<E> last = getLast();
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
	
	public DLLNode<E> getLast(){
		 DLLNode<E> tmp = tail;
		 while(tmp.getNext() != tail){
			 tmp = tmp.getNext();
		 }
		 return tmp;
	}
	
	public void print(){
		if(tail == null){
			return;
		}
		DLLNode<E> tmp = tail;
		while(tmp.getNext() != tail){
			System.out.print(tmp.getData() + ",");
			tmp = tmp.getNext();
		}
		System.out.println(tmp.getData());
	}
	
}
