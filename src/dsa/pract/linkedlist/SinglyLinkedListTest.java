/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class SinglyLinkedListTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Generic SignlyLinkedList Example..");
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
		
		ll.insertAtFirst(10);
		ll.insertAtEnd(20);
		ll.insertAtPosition(15, 1);
		ll.insertAtPosition(5, 0);
		
		ll.print();
		
		ll.deleteAtPos(4);
		
		ll.print();
		
		System.out.println("Length of List by iterative -> " + new LengthOfLinkedList<Integer>().findLength(ll.head));
		System.out.println("Length of List by recursive -> " + new LengthOfLinkedList<Integer>().findLengthByRec(ll.head));
	}
}
