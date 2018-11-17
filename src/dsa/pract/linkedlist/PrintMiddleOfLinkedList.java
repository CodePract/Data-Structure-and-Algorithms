/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class PrintMiddleOfLinkedList {
	
	public static void printMiddleElement(SinglyLinkedList<Integer> slinkedlist){
		
		Node<Integer> slowPointer = slinkedlist.head;
		Node<Integer> fastPointer = slinkedlist.head;
		
		while(fastPointer != null && fastPointer.getNext() != null){
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
		}
		
		System.out.println("Middle Element of list is " + slowPointer.getData());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
		
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		
		printMiddleElement(ll);
	}

}
