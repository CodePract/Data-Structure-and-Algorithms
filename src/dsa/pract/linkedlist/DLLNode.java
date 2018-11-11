/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class DLLNode<E> {
	E data;
	DLLNode<E> prev = null;
	DLLNode<E> next= null;
	
	public DLLNode(E data,DLLNode<E> prev,DLLNode<E> next) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public DLLNode<E> getPrev() {
		return prev;
	}

	public void setPrev(DLLNode<E> prev) {
		this.prev = prev;
	}

	public DLLNode<E> getNext() {
		return next;
	}

	public void setNext(DLLNode<E> next) {
		this.next = next;
	}

}
