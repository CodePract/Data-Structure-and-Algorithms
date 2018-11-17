/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class CircularLinkedList<E> {

	Node<E> tail = null;
	
	public void insertFirst(E e){
		Node<E> node = new Node<E>(e, null);
		if(tail == null){
			node.setNext(node);
		}
		else{
			Node<E> last = getLastNode();
			node.setNext(last.getNext());
			last.setNext(node);
		}
		tail = node;
	}
	
	public void insertLast(E e){
		Node<E> node = new Node<E>(e, null);
		if(tail == null){
			node.setNext(node);
			tail = node;
		}
		else{
			Node<E> last = getLastNode();
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
		Node<E> last = getLastNode();
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
		Node<E> tmp = tail;
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
		Node<E> tmp = tail;
		while(tmp.getNext() != tail){
			System.out.print(tmp.getData() + ",");
			tmp = tmp.getNext();
		}
		System.out.println(tmp.getData() + ",");
	}
	
	public Node<E> getLastNode(){
		Node<E> tmp = tail;
		while(tmp.getNext() != tail){
			tmp = tmp.getNext();
		}
		return tmp;
	}
}
