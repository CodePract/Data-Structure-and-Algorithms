/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class SinglyLinkedList<E> {
	
	Node<E> head = null;
	int length = 0;
	
	//insertion operations
	public void insertAtFirst(E e){
		Node<E> newNode = new Node<E>(e, null);
		newNode.setNext(head);
		head = newNode;
		length++;
	}
	
	public void insertAtEnd(E e){
		Node<E> newNode = new Node<E>(e, null);
		if(head == null){
			head = newNode;
			return;
		}
		Node<E> temp = head;
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		length++;
	}
	
	public void insertAtPosition(E e,int pos){
		Node<E> node = new Node<E>(e, null);
		if(pos <= 0 || head == null){
			node.setNext(head);
			head = node;
		}
		else if(pos > length){
			Node<E> temp = head;
			while(temp.getNext()!= null){
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		else{
			Node<E>  next = head;
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
			Node<E> next = head.getNext(),prev = head;
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
			Node<E> next = head,prev = head;
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
		Node<E> tmp = head;
		while(tmp.getNext() != null){
			System.out.print(tmp.getData() + ",");
			tmp = tmp.getNext();
		}
		System.out.print(tmp.getData() + "\n");
	}

}
