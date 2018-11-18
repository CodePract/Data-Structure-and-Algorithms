/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class FindLengthOfLoopInLinkedList {

	public static int count(Node<Integer> node){
		Node<Integer> temp = node;
		int count = 0;
		while(temp.getNext() != node){
			count++;
			temp = temp.getNext();
		}
		return count;
	}
	
	public static int findLengthOfLoop(Node<Integer> head){
		Node<Integer> slowPointer = head;
		Node<Integer> fastPointer = head;
		while(fastPointer != null && fastPointer.getNext() != null && fastPointer.getNext().getNext() != null){
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			if(slowPointer == fastPointer){
				return count(slowPointer);
			}
		}
		return 0;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		
		ll.head.getNext().getNext().getNext().getNext().setNext(ll.head.getNext());
		
		System.out.println("Length of loop in linkedlist is " +findLengthOfLoop(ll.head));

	}

}
