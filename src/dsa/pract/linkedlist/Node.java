/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class Node<E> {
	E data;
	Node<E> next;
	
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public Node(E data,Node<E> node){
		this.data = data;
		this.next = node;
	}
}
