/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class LengthOfLinkedList<E> {
	
	public int findLength(Node<E> head){
		if(head == null){
			return 0;
		}
		int count = 1;
		while(head.getNext() != null){
			head = head.getNext();
			count++;
		}
		return count;
	}
	
	public int findLengthByRec(Node<E> head){
		if(head == null || head.getNext() == null){
			return 1;
		}
		else{
			return findLengthByRec(head.getNext()) + 1;
		}
	}
	
	public int findLength(DLLNode<E> head,DLLNode<E> head1){
		if(head == null){
			return 0;
		}
		int count = 1;
		while(head.getNext() != null && head.getNext() != head1){
			head = head.getNext();
			count++;
		}
		return count;
	}
	
	public int findLengthByRec(DLLNode<E> head,DLLNode<E> head1){
		if(head == null || head.getNext() == null || head.getNext() == head1){
			return 1;
		}
		else{
			return findLengthByRec(head.getNext(),head1) + 1;
		}
	}

}
