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
		
		DoublyCircularLinkedList<Integer> cl = new DoublyCircularLinkedList<Integer>();
		
		cl.insertFirst(new DLLNode<Integer>(1, null, null));
		cl.insertFirst(new DLLNode<Integer>(2, null, null));
		cl.insertFirst(new DLLNode<Integer>(3, null, null));
		cl.insertFirst(new DLLNode<Integer>(4, null, null));
		cl.print();
		cl.insertLast(new DLLNode<Integer>(5, null, null));
		cl.insertLast(new DLLNode<Integer>(6, null, null));
		cl.insertLast(new DLLNode<Integer>(7, null, null));
		cl.print();
		
		cl.deleteFirst();
		cl.print();
		
		cl.deleteLast();
		cl.deleteLast();
		cl.print();
		
		System.out.println("Length of List by iterative -> " + new LengthOfLinkedList<Integer>().findLength(cl.tail,cl.tail));
		System.out.println("Length of List by recursive -> " + new LengthOfLinkedList<Integer>().findLengthByRec(cl.tail,cl.tail));
	}

}
