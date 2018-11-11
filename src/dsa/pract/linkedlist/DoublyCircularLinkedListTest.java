/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class DoublyCircularLinkedListTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Generic DoublyCircularLinkedList Example..");
		
		DoublyCircularLinkedList<Integer> ll = new DoublyCircularLinkedList<Integer>();
		
		ll.insertFirst(new DLLNode<Integer>(1, null, null));
		ll.insertFirst(new DLLNode<Integer>(2, null, null));
		ll.insertFirst(new DLLNode<Integer>(3, null, null));
		ll.insertFirst(new DLLNode<Integer>(4, null, null));
		ll.print();
		ll.insertLast(new DLLNode<Integer>(5, null, null));
		ll.insertLast(new DLLNode<Integer>(6, null, null));
		ll.insertLast(new DLLNode<Integer>(7, null, null));
		ll.print();
		
		ll.deleteFirst();
		ll.print();
		
		ll.deleteLast();
		ll.deleteLast();
		ll.print();
	}

}
