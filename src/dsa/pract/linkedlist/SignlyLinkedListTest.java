/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class SignlyLinkedListTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Generic SignlyLinkedList Example..");
		SignlyLinkedList<Integer> ll = new SignlyLinkedList<Integer>();
		
		ll.insertAtFirst(new Node<Integer>(10, null));
		ll.insertAtEnd(new Node<Integer>(20, null));
		ll.insertAtPosition(new Node<Integer>(15, null), 1);
		ll.insertAtPosition(new Node<Integer>(5, null), 0);
		
		ll.print();
		
		ll.deleteAtPos(4);
		
		ll.print();
		
		System.out.println("Length of List by iterative -> " + new LengthOfLinkedList<Integer>().findLength(ll.head));
		System.out.println("Length of List by recursive -> " + new LengthOfLinkedList<Integer>().findLengthByRec(ll.head));
	}
}
